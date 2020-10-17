package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 *
 * Gdybyśmy przenieśli metodę drapanie() do
 * interfejsu DzwiekiKota
 * to klasa Kot nie musiała by być abstrakcyjna
 **/
public abstract class Kot extends Animal implements DzwiekiKota {

    public Kot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kot{"+getName()+"}";
    }

    public abstract void drapanie();
}
