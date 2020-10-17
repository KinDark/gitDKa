package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class KotMaurycy extends Kot implements DzwiekiKota {

    public KotMaurycy(String name) {
        super(name);
    }

    @Override
    public void drapanie() {
        System.out.println("Wrr.. Trrr.. po kanapie sobie drapie");
    }

    @Override
    public void mruczenie() {
        System.out.println("Mraaauuu...");
    }
}
