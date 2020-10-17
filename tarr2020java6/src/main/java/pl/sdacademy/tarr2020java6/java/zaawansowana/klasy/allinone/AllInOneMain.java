package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.allinone;

import pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna.DzwiekiKota;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 *
 * Przyklad wszystkiego w jednym pliku
 * niepraktyczne!!!
 **/

class Kot implements Dzwiek {

    private final String name;

    public Kot(String name) {
        this.name = name;
    }

    @Override
    public void mruczenie() {
        System.out.println("mrrmrm....");
    }
}

interface Dzwiek{
    public void mruczenie();
}
// po za klasą

public class AllInOneMain {

    // wnętrze klasy
    public static void main(String[] args) {

        Kot filemon = new Kot("Filemon");
        filemon.mruczenie();
    }
}
