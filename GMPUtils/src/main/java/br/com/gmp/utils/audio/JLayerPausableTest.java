/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.utils.audio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import javazoom.jl.decoder.JavaLayerException;

public class JLayerPausableTest extends JFrame {

    private static final long serialVersionUID = 1L;

    SoundJLayer soundToPlay;

    public static void main(String[] args) {

        JLayerPausableTest jLayerPausable = new JLayerPausableTest();
        jLayerPausable.soundToPlay = new SoundJLayer("/home/kaciano/mp3/test.mp3");

        JLayerPausableTest.interfaceGrafica(jLayerPausable);
    }

// test only
    public static void interfaceGrafica(JLayerPausableTest jLayerPausable) {
        JFrame frame = new JFrame();

        JPanel jContentPane = new JPanel();
// jContentPane.setLayout(null);

// Cor de fundo do painel azul
        jContentPane.setBackground(new Color(0, 104, 139));
// jContentPane.setSize(new Dimension(617, 600));

        JButton buttonPlay = new JButton("Play");
        buttonPlay.setText("Play");
        buttonPlay.setToolTipText("Play");
        buttonPlay.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton buttonPause = new JButton("Pause");
        buttonPause.setText("Pause");
        buttonPause.setToolTipText("Pause");
        buttonPause.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton buttonStop = new JButton("Stop");
        buttonStop.setText("Stop");
        buttonStop.setToolTipText("Stop");
        buttonStop.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JLabel jlbTitulo = new JLabel();
// jlbTitulo.setBounds(new Rectangle(213, 2, 493, 79));
        jlbTitulo.setFont(new Font("Arial", Font.BOLD, 58));
// Centraliza um texto em uma Label
        jlbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jlbTitulo.setForeground(Color.WHITE);
//Titulo da janela
        jlbTitulo.setText("MP3 Player In Java");

        JPanel panel = new JPanel(new GridBagLayout());
// Aplica a cor de fundo painel preto
        panel.setBackground(Color.BLACK);

        jContentPane
                .setLayout(new BoxLayout(jContentPane, BoxLayout.LINE_AXIS));

//jContentPane.setLayout(new BoxLayout(jContentPane, BoxLayout.PAGE_AXIS));
// panel.add(jlbTitulo, null);
        jContentPane.add(Box.createHorizontalStrut(1));
        jContentPane.add(new JSeparator(SwingConstants.VERTICAL));
        jContentPane.add(jlbTitulo, "split 2, span 3");
// jContentPane.addSeparator();
        jContentPane.add(Box.createHorizontalStrut(1));
        jContentPane.add(new JSeparator(SwingConstants.VERTICAL));

// JSeparator separator = new JSeparator();
// jContentPane.add(separator, "growx, wrap");
        jContentPane.add(buttonPlay);
        jContentPane.add(Box.createHorizontalStrut(1));
        jContentPane.add(new JSeparator(SwingConstants.VERTICAL));
        jContentPane.add(buttonPause);
        jContentPane.add(Box.createHorizontalStrut(1));
        jContentPane.add(new JSeparator(SwingConstants.VERTICAL));
        jContentPane.add(buttonStop);
        jContentPane.add(Box.createHorizontalStrut(1));
        jContentPane.add(new JSeparator(SwingConstants.VERTICAL));

        panel.add(jContentPane);

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        buttonPlay.addActionListener(new ButtonListener(jLayerPausable));
        buttonPause.addActionListener(new ButtonListener(jLayerPausable));
        buttonStop.addActionListener(new ButtonListener(jLayerPausable));

        frame.add(panel);

        frame.setPreferredSize(new Dimension(953, 589));
// frame.setSize(953, 589);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

// this.setContentPane(getJContentPane());
// Titulo da Janela Principal
        frame.setTitle("MP3 Player In Java");
// Aparecer no centro da tela
        frame.setLocationRelativeTo(null);
// Impede um novo redimensionamento da janela principal
        frame.setResizable(false);

        frame.setVisible(true);
    }

    public static class ButtonListener implements ActionListener {

        JLayerPausableTest jLayerPausable;

        public ButtonListener(JLayerPausableTest jLayerPausable) {
            this.jLayerPausable = jLayerPausable;
        }

        @Override
        public void actionPerformed(ActionEvent evento) {
            JButton botao = (JButton) evento.getSource();
            if (botao.getText().equalsIgnoreCase("PLAY")) {
                this.jLayerPausable.soundToPlay.play();
            } else if (botao.getText().equalsIgnoreCase("PAUSE")) {
                this.jLayerPausable.soundToPlay.pauseToggle();
            } else if (botao.getText().equalsIgnoreCase("STOP")) {
                this.jLayerPausable.soundToPlay.stop();
            }
        }
    }
}// Fim da classe JLayerPausableTest

class SoundJLayer implements Runnable {

    private String filePath;
    private JLayerPlayerPausable player;
    private Thread playerThread;
    private String namePlayerThread = "AudioPlayerThread";
    private PlaybackListener playbackListener = new PlaybackListener();

    public SoundJLayer(String filePath) {
        this.filePath = filePath;
    }

    public SoundJLayer(String filePath, String namePlayerThread) {
        this.filePath = filePath;
        this.namePlayerThread = namePlayerThread;
    }

    public void play() {
        if (this.player == null) {
            this.playerInitialize();
        } else if (!this.player.isPaused() || this.player.isComplete()
                || this.player.isStopped()) {
            this.stop();
            this.playerInitialize();
        }
        this.playerThread = new Thread(this, namePlayerThread);
        this.playerThread.setDaemon(true);
        this.playerThread.start();
    }

    public void pause() {
        if (this.player != null) {
            this.player.pause();

            if (this.playerThread != null) {
// this.playerThread.stop();
// unsafe method
                this.playerThread = null;
            }
        }
    }

    public void pauseToggle() {
        if (this.player != null) {
            if (this.player.isPaused() && !this.player.isStopped()) {
                this.play();
            } else {
                this.pause();
            }
        }
    }

    public void stop() {
        if (this.player != null) {
            this.player.stop();

            if (this.playerThread != null) {
// this.playerThread.stop();
// unsafe method
                this.playerThread = null;
            }
        }
    }

    /*
     * private void playerInitialize(){ try{ String urlAsString = "file:///" +
     * new java.io.File(".").getCanonicalPath() + "/" + this.filePath;
     *
     * this.player = new JLayerPlayerPausable(new java.net.URL(urlAsString));
     * this.player.setPlaybackListener(this.playbackListener); } catch
     * (JavaLayerException e){ e.printStackTrace(); } }
     */
    private void playerInitialize() {
        try {
            this.player = new JLayerPlayerPausable(this.filePath);
            this.player.setPlaybackListener(this.playbackListener);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

// IRunnable members
    public void run() {
        try {
            this.player.resume();
        } catch (javazoom.jl.decoder.JavaLayerException ex) {
            ex.printStackTrace();
        }
    }

    private static class PlaybackListener extends
            JLayerPlayerPausable.PlaybackAdapter {
// PlaybackListener members

        @Override
        public void playbackStarted(
                JLayerPlayerPausable.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackStarted()");
        }

        @Override
        public void playbackPaused(
                JLayerPlayerPausable.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackPaused()");
        }

        @Override
        public void playbackFinished(
                JLayerPlayerPausable.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackStopped()");
        }
    }
}
