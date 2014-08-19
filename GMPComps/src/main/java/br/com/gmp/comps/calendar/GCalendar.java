package br.com.gmp.comps.calendar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * A panel that allows the user to select a date.
 *
 * @author David Gilbert
 * @version 1.0
 * @author kaciano
 * @version 1.1
 */
public class GCalendar extends JPanel implements ActionListener, ChangeListener {

    /**
     * The date selected in the panel.
     */
    private Calendar chosenDate;

    /**
     * The color for the selected date.
     */
    private Color chosenDateButtonColor;

    /**
     * The color for dates in the current month.
     */
    private Color chosenMonthButtonColor;

    /**
     * The color for dates that are visible, but not in the current month.
     */
    private Color chosenOtherButtonColor;

    /**
     * The first day-of-the-week.
     */
    private int firstDayOfWeek;

    /**
     * The range used for selecting years.
     */
    private int yearSelectionRange = 20;

    /**
     * The font used to display the date.
     */
    private final Font dateFont = new Font("SansSerif", Font.PLAIN, 10);

    /**
     * A combo for selecting the month.
     */
    private JComboBox monthSelector;

    /**
     * A spinner for selecting the month.
     */
    private JSpinner spnMonth;

    /**
     * A combo for selecting the year.
     */
    private JComboBox yearSelector;

    /**
     * A spinner for selecting the year.
     */
    private JSpinner spnYear;

    /**
     * A button for selecting today's date.
     */
    private JButton todayButton;

    /**
     * An array of buttons used to display the days-of-the-month.
     */
    private JButton[] buttons;

    /**
     * A flag that indicates whether or not we are currently refreshing the
     * buttons.
     */
    private boolean refreshing = false;

    /**
     * The ordered set of all seven days of a week, beginning with the
     * 'firstDayOfWeek'.
     */
    private int[] WEEK_DAYS;

    /**
     * Constructs a new date chooser panel, using today's date as the initial
     * selection.
     */
    public GCalendar() {
        this(Calendar.getInstance(), false);
    }

    /**
     * Constructs a new date chooser panel.
     *
     * @param calendar the calendar controlling the date.
     * @param controlPanel a flag that indicates whether or not the 'today'
     * button should appear on the panel.
     */
    public GCalendar(final Calendar calendar,
            final boolean controlPanel) {

        super(new BorderLayout());

        this.chosenDateButtonColor = Color.green.darker();
        this.chosenMonthButtonColor = UIManager.getColor("control");
        this.chosenOtherButtonColor = Color.red.brighter();

        // the default date is today...
        this.chosenDate = calendar;
        this.firstDayOfWeek = calendar.getFirstDayOfWeek();
        this.WEEK_DAYS = new int[7];
        for (int i = 0; i < 7; i++) {
            this.WEEK_DAYS[i] = ((this.firstDayOfWeek + i - 1) % 7) + 1;
        }

        add(constructSelectionPanel(), BorderLayout.NORTH);
        add(getCalendarPanel(), BorderLayout.CENTER);
        if (controlPanel) {
            add(constructControlPanel(), BorderLayout.SOUTH);
        }
        setDate(calendar.getTime());
    }

    /**
     * Sets the date chosen in the panel.
     *
     * @param theDate the new date.
     */
    public void setDate(final Date theDate) {

        this.chosenDate.setTime(theDate);
        this.monthSelector.setSelectedIndex(this.chosenDate.get(
                Calendar.MONTH));
        refreshYearSelector();
        refreshButtons();

    }

    /**
     * Returns the date selected in the panel.
     *
     * @return the selected date.
     */
    public Date getDate() {
        return this.chosenDate.getTime();
    }

    /**
     * Handles action-events from the date panel.
     *
     * @param e information about the event that occurred.
     */
    @Override
    public void actionPerformed(final ActionEvent e) {

        if (e.getActionCommand().equals("monthSelectionChanged")) {
            final JComboBox c = (JComboBox) e.getSource();

            // In most cases, changing the month will not change the selected
            // day.  But if the selected day is 29, 30 or 31 and the newly
            // selected month doesn't have that many days, we revert to the 
            // last day of the newly selected month...
            int dayOfMonth = this.chosenDate.get(Calendar.DAY_OF_MONTH);
            this.chosenDate.set(Calendar.DAY_OF_MONTH, 1);
            this.chosenDate.set(Calendar.MONTH, c.getSelectedIndex());
            int maxDayOfMonth = this.chosenDate.getActualMaximum(
                    Calendar.DAY_OF_MONTH);
            this.chosenDate.set(Calendar.DAY_OF_MONTH, Math.min(dayOfMonth,
                    maxDayOfMonth));
            refreshButtons();
        } else if (e.getActionCommand().equals("yearSelectionChanged")) {
            if (!this.refreshing) {
                final JComboBox c = (JComboBox) e.getSource();
                final Integer y = (Integer) c.getSelectedItem();

                // in most cases, changing the year will not change the 
                // selected day.  But if the selected day is Feb 29, and the
                // newly selected year is not a leap year, we revert to 
                // Feb 28...
                int dayOfMonth = this.chosenDate.get(Calendar.DAY_OF_MONTH);
                this.chosenDate.set(Calendar.DAY_OF_MONTH, 1);
                this.chosenDate.set(Calendar.YEAR, y);
                int maxDayOfMonth = this.chosenDate.getActualMaximum(
                        Calendar.DAY_OF_MONTH);
                this.chosenDate.set(Calendar.DAY_OF_MONTH, Math.min(dayOfMonth,
                        maxDayOfMonth));
                refreshYearSelector();
                refreshButtons();
            }
        } else if (e.getActionCommand().equals("todayButtonClicked")) {
            setDate(new Date());
        } else if (e.getActionCommand().equals("dateButtonClicked")) {
            final JButton b = (JButton) e.getSource();
            final int i = Integer.parseInt(b.getName());
            final Calendar cal = getFirstVisibleDate();
            cal.add(Calendar.DATE, i);
            setDate(cal.getTime());
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    /**
     * Returns a panel of buttons, each button representing a day in the month.
     * This is a sub-component of the DatePanel.
     *
     * @return the panel.
     */
    private JPanel getCalendarPanel() {

        final JPanel p = new JPanel(new GridLayout(7, 7));
        p.setBorder(new EtchedBorder());
        final DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        final String[] weekDays = dateFormatSymbols.getShortWeekdays();

        for (int i = 0; i < this.WEEK_DAYS.length; i++) {
            JLabel label;
            label = new JLabel(weekDays[this.WEEK_DAYS[i]], SwingConstants.CENTER);
            label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 13));
            label.setBackground(Color.RED.darker());
            label.setForeground(Color.WHITE);
            label.setOpaque(true);
            p.add(label);
        }

        this.buttons = new JButton[42];
        for (int i = 0; i < 42; i++) {
            final JButton b = new JButton("");
            b.setMargin(new Insets(1, 1, 1, 1));
            b.setName(Integer.toString(i));
            b.setFont(this.dateFont);
            b.setFocusPainted(false);
            b.setActionCommand("dateButtonClicked");
            b.addActionListener(this);
            this.buttons[i] = b;
            p.add(b);
        }
        return p;

    }

    /**
     * Returns the button color according to the specified date.
     *
     * @param date the date.
     * @return the color.
     */
    private Color getButtonColor(final Calendar date) {
        if (equalDates(date, Calendar.getInstance())) {
            return Color.blue;
        } else if (equalDates(date, this.chosenDate)) {
            return this.chosenDateButtonColor;
        } else if (date.get(Calendar.MONTH) == this.chosenDate.get(
                Calendar.MONTH)) {
            return this.chosenMonthButtonColor;
        } else {
            return this.chosenOtherButtonColor;
        }
    }

    /**
     * Returns true if the two dates are equal (time of day is ignored).
     *
     * @param c1 the first date.
     * @param c2 the second date.
     * @return boolean.
     */
    private boolean equalDates(final Calendar c1, final Calendar c2) {
        return (c1.get(Calendar.DATE) == c2.get(Calendar.DATE))
                && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH))
                && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR));
    }

    /**
     * Returns the first date that is visible in the grid. This should always be
     * in the month preceding the month of the selected date.
     *
     * @return the date.
     */
    private Calendar getFirstVisibleDate() {
        final Calendar c = Calendar.getInstance();
        c.set(this.chosenDate.get(Calendar.YEAR), this.chosenDate.get(
                Calendar.MONTH), 1);
        c.add(Calendar.DATE, -1);
        while (c.get(Calendar.DAY_OF_WEEK) != getFirstDayOfWeek()) {
            c.add(Calendar.DATE, -1);
        }
        return c;
    }

    /**
     * Returns the first day of the week (controls the labels in the date
     * panel).
     *
     * @return the first day of the week.
     */
    private int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    /**
     * Update the button labels and colors to reflect date selection.
     */
    private void refreshButtons() {
        final Calendar c = getFirstVisibleDate();
        for (int i = 0; i < 42; i++) {
            final JButton b = this.buttons[i];
            b.setText(Integer.toString(c.get(Calendar.DATE)));
            b.setForeground(getButtonColor(c));
            c.add(Calendar.DATE, 1);
        }
    }

    /**
     * Changes the contents of the year selection JComboBox to reflect the
     * chosen date and the year range.
     */
    private void refreshYearSelector() {
        if (!this.refreshing) {
            this.refreshing = true;
            this.yearSelector.removeAllItems();
            final Integer[] years = getYears(this.chosenDate.get(
                    Calendar.YEAR));
            for (Integer year : years) {
                this.yearSelector.addItem(year);
            }
            this.yearSelector.setSelectedItem(this.chosenDate.get(Calendar.YEAR));
            this.refreshing = false;
        }
    }

    /**
     * Returns a vector of years preceding and following the specified year. The
     * number of years preceding and following is determined by the
     * yearSelectionRange attribute.
     *
     * @param chosenYear the selected year.
     * @return a vector of years.
     */
    private Integer[] getYears(final int chosenYear) {
        final int size = this.yearSelectionRange * 2 + 1;
        final int start = chosenYear - this.yearSelectionRange;

        final Integer[] years = new Integer[size];
        for (int i = 0; i < size; i++) {
            years[i] = (i + start);
        }
        return years;
    }

    /**
     * Constructs a panel containing two JComboBoxes (for the month and year)
     * and a button (to reset the date to TODAY).
     *
     * @return the panel.
     */
    private JPanel constructSelectionPanel() {
        final JPanel p = new JPanel();

        final int min = this.chosenDate.getMinimum(Calendar.MONTH) + 1;
        final int max = this.chosenDate.getMaximum(Calendar.MONTH) + 1;
        final int actual = this.chosenDate.get(Calendar.MONTH);
        final String[] months = new String[max - min + 1];
        for (int i = 0; i < months.length; i++) {
            months[i] = "" + i;
        }

        p.setLayout(new GridLayout(1, 3));
        //----------------------------------------------------------------------
        this.spnMonth = new JSpinner(new SpinnerNumberModel(actual + 1, min, max, 1));
        this.spnMonth.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                monthChanged(e);
            }
        });
        p.add(spnMonth);
        //----------------------------------------------------------------------
        this.spnYear = new JSpinner(new SpinnerNumberModel(
                Calendar.getInstance().get(Calendar.YEAR), 1900, 2099, 1));
        this.spnYear.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                yearChanged(e);
            }
        });
        p.add(spnYear);
        //----------------------------------------------------------------------
        this.monthSelector = new JComboBox(months);
        this.monthSelector.addActionListener(this);
        this.monthSelector.setActionCommand("monthSelectionChanged");
        //p.add(this.monthSelector);
        //----------------------------------------------------------------------
        this.yearSelector = new JComboBox(getYears(0));
        this.yearSelector.addActionListener(this);
        this.yearSelector.setActionCommand("yearSelectionChanged");
        //p.add(this.yearSelector);

        return p;
    }

    /**
     * Método chamado na troca de meses
     *
     * @param e {@code ChangeEvent} Evento do Spinner
     */
    private void monthChanged(ChangeEvent e) {
        final JSpinner c = (JSpinner) e.getSource();
        int dayOfMonth = GCalendar.this.chosenDate.get(Calendar.DAY_OF_MONTH);
        GCalendar.this.chosenDate.set(Calendar.DAY_OF_MONTH, 1);
        GCalendar.this.chosenDate.set(Calendar.MONTH, (Integer) c.getValue());
        int maxDayOfMonth = GCalendar.this.chosenDate.getActualMaximum(
                Calendar.DAY_OF_MONTH);
        GCalendar.this.chosenDate.set(Calendar.DAY_OF_MONTH, Math.min(dayOfMonth,
                maxDayOfMonth));
        refreshButtons();
    }

    /**
     * Método chamado na troca de anos
     *
     * @param e {@code ChangeEvent} Evento do Spinner
     */
    private void yearChanged(ChangeEvent e) {
        if (!GCalendar.this.refreshing) {
            final JSpinner c = (JSpinner) e.getSource();
            final Integer y = (Integer) c.getValue();

            int dayOfMonth = GCalendar.this.chosenDate.get(Calendar.DAY_OF_MONTH);
            GCalendar.this.chosenDate.set(Calendar.DAY_OF_MONTH, 1);
            GCalendar.this.chosenDate.set(Calendar.YEAR, y);
            int maxDayOfMonth = GCalendar.this.chosenDate.getActualMaximum(
                    Calendar.DAY_OF_MONTH);
            GCalendar.this.chosenDate.set(Calendar.DAY_OF_MONTH,
                    Math.min(dayOfMonth, maxDayOfMonth));
            refreshYearSelector();
            refreshButtons();
        }
    }

    /**
     * Returns a panel that appears at the bottom of the calendar panel -
     * contains a button for selecting today's date.
     *
     * @return the panel.
     */
    private JPanel constructControlPanel() {
        final JPanel p = new JPanel();
        p.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
        this.todayButton = new JButton("Today");
        this.todayButton.addActionListener(this);
        this.todayButton.setActionCommand("todayButtonClicked");
        p.add(this.todayButton);
        return p;
    }

    /**
     * Returns the color for the currently selected date.
     *
     * @return a color.
     */
    public Color getChosenDateButtonColor() {
        return this.chosenDateButtonColor;
    }

    /**
     * Redefines the color for the currently selected date.
     *
     * @param chosenDateButtonColor the new color
     */
    public void setChosenDateButtonColor(final Color chosenDateButtonColor) {
        if (chosenDateButtonColor == null) {
            throw new NullPointerException("UIColor must not be null.");
        }
        final Color oldValue = this.chosenDateButtonColor;
        this.chosenDateButtonColor = chosenDateButtonColor;
        refreshButtons();
        firePropertyChange("chosenDateButtonColor", oldValue,
                chosenDateButtonColor);
    }

    /**
     * Returns the color for the buttons representing the current month.
     *
     * @return the color for the current month.
     */
    public Color getChosenMonthButtonColor() {
        return this.chosenMonthButtonColor;
    }

    /**
     * Defines the color for the buttons representing the current month.
     *
     * @param chosenMonthButtonColor the color for the current month.
     */
    public void setChosenMonthButtonColor(final Color chosenMonthButtonColor) {
        if (chosenMonthButtonColor == null) {
            throw new NullPointerException("UIColor must not be null.");
        }
        final Color oldValue = this.chosenMonthButtonColor;
        this.chosenMonthButtonColor = chosenMonthButtonColor;
        refreshButtons();
        firePropertyChange("chosenMonthButtonColor", oldValue,
                chosenMonthButtonColor);
    }

    /**
     * Returns the color for the buttons representing the other months.
     *
     * @return a color.
     */
    public Color getChosenOtherButtonColor() {
        return this.chosenOtherButtonColor;
    }

    /**
     * Redefines the color for the buttons representing the other months.
     *
     * @param chosenOtherButtonColor a color.
     */
    public void setChosenOtherButtonColor(final Color chosenOtherButtonColor) {
        if (chosenOtherButtonColor == null) {
            throw new NullPointerException("UIColor must not be null.");
        }
        final Color oldValue = this.chosenOtherButtonColor;
        this.chosenOtherButtonColor = chosenOtherButtonColor;
        refreshButtons();
        firePropertyChange("chosenOtherButtonColor", oldValue,
                chosenOtherButtonColor);
    }

    /**
     * Returns the range of years available for selection (defaults to 20).
     *
     * @return The range.
     */
    public int getYearSelectionRange() {
        return this.yearSelectionRange;
    }

    /**
     * Sets the range of years available for selection.
     *
     * @param yearSelectionRange the range.
     */
    public void setYearSelectionRange(final int yearSelectionRange) {
        final int oldYearSelectionRange = this.yearSelectionRange;
        this.yearSelectionRange = yearSelectionRange;
        refreshYearSelector();
        firePropertyChange("yearSelectionRange", oldYearSelectionRange,
                yearSelectionRange);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
