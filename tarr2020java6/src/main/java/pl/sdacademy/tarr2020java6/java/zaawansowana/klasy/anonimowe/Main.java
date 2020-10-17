package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.anonimowe;

import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.Figura;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kolo;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kwadrat;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Mammal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Squirrel;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5);
        float poleKwadratu = kwadrat.obliczPole();
        System.out.println(poleKwadratu);

        // Kolo extends Figura
        Figura kolo = new Kolo(5);
        float poleKolo = kolo.obliczPole();

        // klasa anonimowa
        /**
         * Kwadrat i Koło to klasy które istnieją
         * w plikach w opowiednich pakietach
         * klasa anonimowa istnieje tam gdzie ją tworzmy
         */
        //Figura prostokat = new Figura();// klasa abstakcjyjna nie można tworzyć
        // w taki sposób
        Figura trapez = new Figura() {

            int a = 5;
            int b = 6;
            int h = 3;
            int r = 2;

            @Override
            public float obliczPole() {
                return ((a+b)*h)/2;
            }

            @Override
            public float obliczObwod() {
                return a+b+2*r;
            }
        };
        float poleTrapez = trapez.obliczPole();
        System.out.println(poleTrapez);


        /**
         * Zadanie. Stwórz anonimową klasę zwierzaka,
         * którego nie masz w klasie (pakiecie)
         */
        Animal kot = new Animal("Kot"){

            public void runAwayFrom(Animal animal)
            {
                System.out.printf("\n%s miauczy przed %s\n",this.getName(),animal.getName());
                this.setEscape(true);
            }

        };

        kot.runAwayFrom(new Animal("Pies"));

        // wiewiorka to nie jest klasa anonimowa
        Squirrel wiewiorka = new Squirrel("Wiewiórka");
        System.out.println("=================");
        System.out.println("Wiewiórka "+wiewiorka.getClass().getName());
        System.out.println("Kot "+kot.getClass().getName());

    }
}
