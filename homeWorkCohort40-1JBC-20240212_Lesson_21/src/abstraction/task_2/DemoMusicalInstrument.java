package abstraction.task_2;

public class DemoMusicalInstrument {
    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument violin = new Violin();
        guitar.playNote();
        piano.playNote();
        violin.playNote();
    }
}
