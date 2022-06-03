package launchpad;

import java.io.*;
import java.util.Map;
import javazoom.jlgui.basicplayer.*;

public class Musica implements BasicPlayerListener {

    private PrintStream out = null;

    public Musica() {
        out = System.out;
    }

    void play(String file) throws BasicPlayerException {
        BasicPlayer player = new BasicPlayer();
        BasicController control = (BasicController) player;
        player.addBasicPlayerListener(this);
        try {
            control.open(new File(file));
            control.play();
            control.setGain(0.50);
        } catch (BasicPlayerException e) {
        }
    }

    @Override
    public void opened(Object stream, Map properties) {
        // Pay attention to properties. It's useful to get duration, 
        // bitrate, channels, even tag such as ID3v2.
        //display("opened : ");
    }

    @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        // Pay attention to properties. It depends on underlying JavaSound SPI
        // MP3SPI provides mp3.equalizer.
        //display("progress : ");
    }

    @Override
    public void stateUpdated(BasicPlayerEvent event) {
        // Notification of BasicPlayer states (opened, playing, end of media, ...)
        //display("stateUpdated : ");
    }

    @Override
    public void setController(BasicController controller) {
        //display("setController : " + controller);
    }

    public void display(String msg) {
        if (out != null) {
            out.println(msg);
        }
    }
}
