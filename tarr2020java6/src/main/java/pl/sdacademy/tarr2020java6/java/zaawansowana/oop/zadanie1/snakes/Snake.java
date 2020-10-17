package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.snakes;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.interfejsy.Predator;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public abstract class Snake extends Animal implements Predator {
    public Snake(String name) {
        super(name);
    }

    // metoda poruszania się zygzakiem goZigzag()

}
