package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Lowca<A extends Animal> implements Polowanie {

    @Override
    public void rozpoczecie() {
        System.out.println("Rozpoczęcie polowania...");
    }

    @Override
    public void zlapanieDoKlatki(Animal animal) {
        System.out.println(animal.getName()+" został złapany do klatki");
    }


}
