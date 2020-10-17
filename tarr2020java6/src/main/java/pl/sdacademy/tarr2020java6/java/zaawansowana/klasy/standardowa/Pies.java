package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.standardowa;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.plants.Plant;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class Pies extends Animal {

    public Pies(String name) {
        super(name);
    }

    public void aport(Plant plant) {
        System.out.println(getName()+ " aportuje "+plant.getClass().getSimpleName().toLowerCase());
    }
}
