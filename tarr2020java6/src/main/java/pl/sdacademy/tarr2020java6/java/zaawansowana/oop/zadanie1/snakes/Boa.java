package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.snakes;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Elephant;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Lion;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Boa extends Snake {

    public Boa(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Deer
    }

    // metoda duszenia strangle(Animal animal)
    // nie może udusić słonia!
    public void strangle(Animal animal){
        if(animal instanceof Elephant){// instanceof - jest instancją(typem) Elephant(słonia)
            System.out.printf("\n\"%s\" nie da rady udusić \"%s\"",this.getName(),animal.getName());
        }else{
            System.out.printf("\n\"%s\" dusi \"%s\"",this.getName(),animal.getName());
        }
    }
}