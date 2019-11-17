import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main (String [] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }
    public void go () {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int [] eventIWant = {127};
            sequencer.addControllerEventListener(this, eventIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();


        }
    }

}
