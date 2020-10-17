package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class KotBonifacy extends Kot{
    public KotBonifacy(String name) {
        super(name);
    }

    @Override
    public void drapanie() {
        System.out.println("... mrrrRRrr drapanie po kolanie");
    }

    @Override
    public void mruczenie() {
        System.out.println("...mmRRRrrr..");
    }
}
