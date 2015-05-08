package br.com.gmp.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Coleção de métodos utilitários para trabalhar Datas
 *
 * @author kaciano
 * @version 1.0
 */
public class DateUtil {

    /**
     * Data do dia {@code d MMMMMM yyyy}
     */
    public static String DAY = "d MMMMMM yyyy";
    /**
     * Data para exportação {@code yyyy_MM_dd_HH_mm_ss}
     */
    public static String TXTDATE = "yyyy_MM_dd_HH_mm_ss";
    /**
     * Data para exportação {@code yyyy_MM_dd}
     */
    public static String DATE = "yyyy_MM_dd";
    /**
     * Horas {@code HH:mm:ss}
     */
    public static String HOUR = "HH:mm:ss";
    /**
     * Data completa, por extenso {@code "EEEEE, d MMMMMM yyyy - HH:mm:ss"}
     */
    public static String COMPLETE = "EEEEE, d MMMMMM yyyy - HH:mm:ss";

    /**
     * Data atual
     */
    public static Date NOW = new Date();

    /**
     * Retorna um array contendo todos ultimos 100 anos
     *
     * @return {@code String[]} Array de anos
     */
    public String[] getYears() {
        int actual = new Date().getYear() + 1900;
        int initial = actual - 100;
        int dif = 100;
        String[] yearList = new String[dif];
        int j = 0;
        for (int i = actual; i != initial; i--) {
            if (j <= 100) {
                yearList[j] = String.valueOf(i);
                j++;
            } else {
                break;
            }
        }
        return yearList;
    }

    /**
     * Retorna um List contendo todos ultimos 100 anos
     *
     * @return {@code List(String)} Lista dos anos
     */
    public List<String> getYearList() {
        return Arrays.asList(getYears());
    }

    /**
     * Retorna a quantidade de dias entre uma data e outra. Formato da data
     * (dd/MM/yyyy)
     *
     * @param begin {@code <b>String</b>} Data inicial
     * @param end {@code <b>String</b>} Data final
     * @return {@code <b>Integer</b>} Diferença em dias
     * @throws java.text.ParseException Exceção de conversão
     */
    public int daysBetween(String begin, String end) throws ParseException {
        GregorianCalendar ini = new GregorianCalendar();
        GregorianCalendar fim = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ini.setTime(sdf.parse(begin));
        fim.setTime(sdf.parse(end));
        long dt1 = ini.getTimeInMillis();
        long dt2 = fim.getTimeInMillis();
        return (int) (((dt2 - dt1) / 86400000) + 1);
    }

    /**
     * Retorna a quantidade de dias entre uma data e outra.
     *
     * @param begin {@code <b>String</b>} Data inicial
     * @param end {@code <b>String</b>} Data final
     * @param format {@code <b>String</b>} Formato das datas
     * @return {@code <b>Integer</b>} Diferença em dias
     * @throws java.text.ParseException Exceção de conversão
     */
    public int daysBetween(String begin, String end, String format) throws ParseException {
        GregorianCalendar ini = new GregorianCalendar();
        GregorianCalendar fim = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        ini.setTime(sdf.parse(begin));
        fim.setTime(sdf.parse(end));
        long dt1 = ini.getTimeInMillis();
        long dt2 = fim.getTimeInMillis();
        return (int) (((dt2 - dt1) / 86400000) + 1);
    }

    /**
     * Retorna a quantidade de dias entre uma data e outra
     *
     * @param begin {@code <b>Date</b>} Data inicial
     * @param end {@code <b>Date</b>} Data final
     * @return {@code <b>Integer</b>} Diferença em dias
     * @throws java.text.ParseException Exceção de conversão
     */
    public int daysBetween(Date begin, Date end) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return daysBetween(sdf.format(begin), sdf.format(end));
    }

    /**
     * Verifica se uma data está em um determinado periodo de tempo
     *
     * @param param {@code <b>Date</b>} Data parametro
     * @param first {@code <b>Date</b>} Data inicial
     * @param last {@code <b>Date</b>} Data final
     * @return {@code Boolean} Está no periodo?
     */
    public Boolean isBetween(Date param, Date first, Date last) {
        return param.after(first) && param.before(last);
    }

    /**
     * Verifica se uma data está em um determinado periodo de tempo. Formato da
     * data (dd/MM/yyyy)
     *
     * @param param {@code <b>String</b>} Data parametro
     * @param first {@code <b>String</b>} Data inicial
     * @param last {@code <b>String</b>} Data final
     * @return {@code Boolean} Está no periodo?
     * @throws java.text.ParseException Exceção de conversão
     */
    public Boolean isBetween(String param, String first, String last) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date p = sdf.parse(param);
        Date begin = sdf.parse(first);
        Date end = sdf.parse(last);
        return isBetween(p, begin, end);
    }

    /**
     * Verifica se uma data está em um determinado periodo de tempo. Formato da
     * data (dd/MM/yyyy)
     *
     * @param param {@code <b>String</b>} Data parametro
     * @param first {@code <b>String</b>} Data inicial
     * @param last {@code <b>String</b>} Data final
     * @param format {@code <b>String</b>} Formato das datas
     * @return {@code Boolean} Está no periodo?
     * @throws java.text.ParseException Exceção de conversão
     */
    public Boolean isBetween(String param, String first, String last, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date p = sdf.parse(param);
        Date begin = sdf.parse(first);
        Date end = sdf.parse(last);
        return isBetween(p, begin, end);
    }

    /**
     * Retorna a data formatada conforme o padrão recebido<br>
     * <table border=0 cellspacing=3 cellpadding=0 summary="Chart shows pattern
     * letters, date/time component, presentation, and examples.">
     * <tr>
     * <th align=left>Letter
     * <th align=left>Date or Time Component
     * <th align=left>Presentation
     * <th align=left>Examples
     * <tr>
     * <td>{@code G}
     * <td>Era designator
     * <td><a href="#text">Text</a>
     * <td>{@code AD}
     * <tr>
     * <td>{@code y}
     * <td>Year
     * <td><a href="#year">Year</a>
     * <td>{@code 1996}; {@code 96}
     * <tr>
     * <td>{@code Y}
     * <td>Week year
     * <td><a href="#year">Year</a>
     * <td>{@code 2009}; {@code 09}
     * <tr>
     * <td>{@code M}
     * <td>Month in year
     * <td><a href="#month">Month</a>
     * <td>{@code July}; {@code Jul}; {@code 07}
     * <tr>
     * <td>{@code w}
     * <td>Week in year
     * <td><a href="#number">Number</a>
     * <td>{@code 27}
     * <tr>
     * <td>{@code W}
     * <td>Week in month
     * <td><a href="#number">Number</a>
     * <td>{@code 2}
     * <tr>
     * <td>{@code D}
     * <td>Day in year
     * <td><a href="#number">Number</a>
     * <td>{@code 189}
     * <tr>
     * <td>{@code d}
     * <td>Day in month
     * <td><a href="#number">Number</a>
     * <td>{@code 10}
     * <tr>
     * <td>{@code F}
     * <td>Day of week in month
     * <td><a href="#number">Number</a>
     * <td>{@code 2}
     * <tr>
     * <td>{@code E}
     * <td>Day name in week
     * <td><a href="#text">Text</a>
     * <td>{@code Tuesday}; {@code Tue}
     * <tr>
     * <td>{@code u}
     * <td>Day number of week (1 = Monday, ..., 7 = Sunday)
     * <td><a href="#number">Number</a>
     * <td>{@code 1}
     * <tr>
     * <td>{@code a}
     * <td>Am/pm marker
     * <td><a href="#text">Text</a>
     * <td>{@code PM}
     * <tr>
     * <td>{@code H}
     * <td>Hour in day (0-23)
     * <td><a href="#number">Number</a>
     * <td>{@code 0}
     * <tr>
     * <td>{@code k}
     * <td>Hour in day (1-24)
     * <td><a href="#number">Number</a>
     * <td>{@code 24}
     * <tr>
     * <td>{@code K}
     * <td>Hour in am/pm (0-11)
     * <td><a href="#number">Number</a>
     * <td>{@code 0}
     * <tr>
     * <td>{@code h}
     * <td>Hour in am/pm (1-12)
     * <td><a href="#number">Number</a>
     * <td>{@code 12}
     * <tr>
     * <td>{@code m}
     * <td>Minute in hour
     * <td><a href="#number">Number</a>
     * <td>{@code 30}
     * <tr>
     * <td>{@code s}
     * <td>Second in minute
     * <td><a href="#number">Number</a>
     * <td>{@code 55}
     * <tr>
     * <td>{@code S}
     * <td>Millisecond
     * <td><a href="#number">Number</a>
     * <td>{@code 978}
     * <tr>
     * <td>{@code z}
     * <td>Time zone
     * <td><a href="#timezone">General time zone</a>
     * <td>{@code Pacific Standard Time}; {@code PST};
     * {@code GMT-08:00}
     * <tr>
     * <td>{@code Z}
     * <td>Time zone
     * <td><a href="#rfc822timezone">RFC 822 time zone</a>
     * <td>{@code -0800}
     * <tr>
     * <td>{@code X}
     * <td>Time zone
     * <td><a href="#iso8601timezone">ISO 8601 time zone</a>
     * <td>{@code -08}; {@code -0800};  {@code -08:00}
     * </table>
     *
     * @param date {@code <b>Date</b>} Data parametro
     * @param pattern {@code <b>String</b>} Padrão de formatação
     * @return {@code <b>String</b>} Data formatada
     */
    public String getFormattedDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * Retorna a data por extenso
     *
     * @param date {@code <b>Date</b>} Data parametro
     * @return {@code <b>String</b>} Data por extenso
     */
    public String getCompleteDate(Date date) {
        return getFormattedDate(date, COMPLETE);
    }

    public static void main(String[] args) {
        System.out.println(new DateUtil().getCompleteDate(new Date()));
    }
}
