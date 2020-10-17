package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.interfejsy.Predator;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class Lion extends Mammal implements Predator {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        if (animal.isEscape())
        {
            System.out.printf("\n%s: %s uciekłeś mi :(",this.getName(),animal.getName());
        }
        else
        {
            System.out.printf("\n%s: %s złapałem Cię i zjadłem",this.getName(),animal.getName());
        }
    }
}
