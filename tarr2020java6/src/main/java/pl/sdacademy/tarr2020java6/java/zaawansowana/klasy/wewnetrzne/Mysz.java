package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.wewnetrzne;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
// a tutaj jesteśmy poza klasą

public class Mysz extends Animal {
    // wewnątrz klasy

    // klasa wewnętrzna
    public class Zbiory extends ArrayList<String> {
        // klasa wewnętrzna może posiadać: pole, konstruktor, metody
        private final String nazwa;

        public Zbiory(String nazwa) {
            this.nazwa = nazwa;
        }

        public void wypisz() {
            System.out.println("Zbiory '"+nazwa+"':");
            // this - czyli klasa w której jesteśmy
            // : oznacza 'z'
            // wypisz elementy zbioru z siebie
            for (String elementZbioru: this){
                System.out.println("* "+elementZbioru);
            }
        }
    }

    //pole w klasie Mysz o nazwie 'zbiory' typu Zbiory
    private Zbiory zbiory;

    public Mysz(String name) {
        super(name);
        zbiory = new Zbiory("na zime");
        // poniżej poprawna możliwość
        //List zbiory1 = new Zbiory();
    }

    public void pokazZbiory(){
        zbiory.wypisz();
    }

    public void zbierz(String przedmiot){
        //dodać element do zbioru
        zbiory.add(przedmiot);
        System.out.println("Mysz '"+getName()+"' zebrala "+przedmiot);
    }

    public Zbiory stworzZbiory(String nazwa){
        return new Zbiory(nazwa);
    }


    public static Zbiory stworzZbioryBezMyszy(String nazwa){
        return new Mysz("").stworzZbiory(nazwa);
    }

    public Zbiory zabierzZbiory(){
        return zbiory;
    }
}
