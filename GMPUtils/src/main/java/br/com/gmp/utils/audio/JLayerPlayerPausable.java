package br.com.gmp.utils.audio;

/**
 * ----------------------------------------------------------------------- This
 * program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Library General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 * 
* This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library General Public License for more
 * details.
 * 
* You should have received a copy of the GNU Library General Public License
 * along with this program; if not, write to the Free Software Foundation, Inc.,
 * 675 Mass Ave, Cambridge, MA 02139, USA.
 * 
* Original by:
 * http://thiscouldbebetter.wordpress.com/2011/07/04/pausing-an-mp3-file-using-jlayer/
 * Last modified: 21-jul-2012 by Arthur Assuncao
 * ----------------------------------------------------------------------
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;

//This class is loosely based on javazoom.jl.player.AdvancedPlayer.
public class JLayerPlayerPausable {

    private URL urlToStreamFrom;
    private String audioPath;
    private Bitstream bitstream;
    private Decoder decoder;
    private AudioDevice audioDevice;
    private boolean closed;
    private boolean complete;
    private boolean paused;
    private boolean stopped;
    private PlaybackListener listener;
    private int frameIndexCurrent;
    private final int lostFrames = 20;

    public JLayerPlayerPausable(URL urlToStreamFrom) throws JavaLayerException {
        this.urlToStreamFrom = urlToStreamFrom;
        this.listener = new PlaybackAdapter();
    }

    public JLayerPlayerPausable(String audioPath) throws JavaLayerException {
        this.audioPath = audioPath;
        this.listener = new PlaybackAdapter();
    }

    public void setPlaybackListener(PlaybackListener newPlaybackListener) {
        if (newPlaybackListener != null) {
            this.listener = newPlaybackListener;
        } else {
            throw new NullPointerException("PlaybackListener is null");
        }
    }

    private InputStream getAudioInputStream() throws IOException {
        if (this.audioPath != null) {
            return new FileInputStream(this.audioPath);
        } else if (this.urlToStreamFrom != null) {
            this.urlToStreamFrom.openStream();
        }
        return null;
    }

    public boolean play() throws JavaLayerException {
        return this.play(0);
    }

    public boolean play(int frameIndexStart) throws JavaLayerException {
        return this.play(frameIndexStart, -1, lostFrames);
    }

    public boolean play(int frameIndexStart, int frameIndexFinal,
            int correctionFactorInFrames) throws JavaLayerException {
        try {
            this.bitstream = new Bitstream(this.getAudioInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.audioDevice = FactoryRegistry.systemRegistry().createAudioDevice();
        this.decoder = new Decoder();
        this.audioDevice.open(this.decoder);

        boolean shouldContinueReadingFrames = true;

        this.paused = false;
        this.stopped = false;
        this.frameIndexCurrent = 0;

        while (shouldContinueReadingFrames == true
                && this.frameIndexCurrent < frameIndexStart
                - correctionFactorInFrames) {
            shouldContinueReadingFrames = this.skipFrame();
            this.frameIndexCurrent++;
        }

        if (this.listener != null) {
            this.listener.playbackStarted(new PlaybackEvent(this,
                    PlaybackEvent.EventType.Instances.Started, this.audioDevice
                    .getPosition()));
        }

        if (frameIndexFinal < 0) {
            frameIndexFinal = Integer.MAX_VALUE;
        }

        while (shouldContinueReadingFrames == true
                && this.frameIndexCurrent < frameIndexFinal) {
            if (this.paused || this.stopped) {
                shouldContinueReadingFrames = false;
                try {
                    Thread.sleep(1);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                shouldContinueReadingFrames = this.decodeFrame();
                this.frameIndexCurrent++;
            }
        }

// last frame, ensure all data flushed to the audio device.
        if (this.audioDevice != null && !this.paused) {
            this.audioDevice.flush();

            synchronized (this) {
                this.complete = (this.closed == false);
                this.close();
            }

// report to listener
            if (this.listener != null) {
                int audioDevicePosition = -1;
                if (this.audioDevice != null) {
                    audioDevicePosition = this.audioDevice.getPosition();
                } else {
// throw new
// NullPointerException("attribute audioDevice in " +
// this.getClass() + " is NULL");
                }
                PlaybackEvent playbackEvent = new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Stopped,
                        audioDevicePosition);
                this.listener.playbackFinished(playbackEvent);
            }
        }

        return shouldContinueReadingFrames;
    }

    public boolean resume() throws JavaLayerException {
        return this.play(this.frameIndexCurrent);
    }

    public synchronized void close() {
        if (this.audioDevice != null) {
            this.closed = true;

            this.audioDevice.close();

            this.audioDevice = null;

            try {
                this.bitstream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    protected boolean decodeFrame() throws JavaLayerException {
        boolean returnValue = false;
        if (this.stopped) { // nothing for decode
            return false;
        }

        try {
            if (this.audioDevice != null) {
                Header header = this.bitstream.readFrame();
                if (header != null) {
// sample buffer set when decoder constructed
                    SampleBuffer output = (SampleBuffer) this.decoder
                            .decodeFrame(header, this.bitstream);

                    synchronized (this) {
                        if (this.audioDevice != null) {
                            this.audioDevice.write(output.getBuffer(), 0,
                                    output.getBufferLength());
                        }
                    }

                    this.bitstream.closeFrame();
                    returnValue = true;
                } else {
                    System.out.println("End of file"); // end of file
// this.stop();
                    returnValue = false;
                }
            }
        } catch (RuntimeException ex) {
            throw new JavaLayerException("Exception decoding audio frame", ex);
        }
        return returnValue;
    }

    public void pause() {
        if (!this.stopped) {
            this.paused = true;
            if (this.listener != null) {
                this.listener.playbackPaused(new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Paused,
                        this.audioDevice.getPosition()));
            }
            this.close();
        }
    }

    protected boolean skipFrame() throws JavaLayerException {
        boolean returnValue = false;
        Header header = this.bitstream.readFrame();

        if (header != null) {
            this.bitstream.closeFrame();
            returnValue = true;
        }

        return returnValue;
    }

    public void stop() {
        if (!this.stopped) {
            if (!this.closed) {
                this.listener.playbackFinished(new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Stopped,
                        this.audioDevice.getPosition()));
                this.close();
            } else if (this.paused) {
                int audioDevicePosition = -1; // this.audioDevice.getPosition(),
// audioDevice is null
                this.listener.playbackFinished(new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Stopped,
                        audioDevicePosition));
            }
            this.stopped = true;
        }
    }

// @return the closed
    public boolean isClosed() {
        return closed;
    }

// @return the complete
    public boolean isComplete() {
        return complete;
    }

// @return the paused
    public boolean isPaused() {
        return paused;
    }

// @return the stopped
    public boolean isStopped() {
        return stopped;
    }

// inner classes
    public static class PlaybackEvent {

        public JLayerPlayerPausable source;
        public EventType eventType;
        public int frameIndex;

        public PlaybackEvent(JLayerPlayerPausable source, EventType eventType,
                int frameIndex) {
            this.source = source;
            this.eventType = eventType;
            this.frameIndex = frameIndex;
        }

        public static class EventType {

            public String name;

            public EventType(String name) {
                this.name = name;
            }

            public static class Instances {

                public static EventType Started = new EventType("Started");
                public static EventType Paused = new EventType("Paused");
                public static EventType Stopped = new EventType("Stopped");
            }
        }
    }

    public static class PlaybackAdapter implements PlaybackListener {

        @Override
        public void playbackStarted(PlaybackEvent event) {
            System.err.println("Playback started");
        }

        @Override
        public void playbackPaused(PlaybackEvent event) {
            System.err.println("Playback paused");
        }

        @Override
        public void playbackFinished(PlaybackEvent event) {
            System.err.println("Playback stopped");
        }
    }

    public static interface PlaybackListener {

        public void playbackStarted(PlaybackEvent event);

        public void playbackPaused(PlaybackEvent event);

        public void playbackFinished(PlaybackEvent event);
    }
}
