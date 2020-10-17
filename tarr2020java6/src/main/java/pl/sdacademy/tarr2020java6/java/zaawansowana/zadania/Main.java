package pl.sdacademy.tarr2020java6.java.zaawansowana.zadania;

import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2.Dictionary;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2.DictionaryImpl;
import pl.sdacademy.tarr2020java6.java.zaawansowana.zadania.ulamki.Ulamek;
import pl.sdacademy.tarr2020java6.java.zaawansowana.zadania.zwierzak.Zwierzak;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
public class Main {
    /**
     * * zadanie z wyjątkami
     * ze slajdu stworzenie odpowiednich wyjątków oraz przetestowanie
     * 		- Wyjątek na mianownik równy zero
     * 		- wyjątek na wyszukanie w słowniku nie istniejacego slowa - zadanie2
     * 		- wyjątek na zwierzaka z imieniem pustym - null
     */
    public static void main(String[] args) {

        /**
         * Wyjątek na mianownik równy zero
         */
        Wypisz.tytul("Zadanie: Ulamek mianownik rowny zero");
        try {
            Ulamek ulamek12 = new Ulamek(1, 2);
            System.out.println(ulamek12);

            Ulamek ulamek10 = new Ulamek(1, 0);
            System.out.println(ulamek10);
        }catch(Exception e){// obslużenie wyjątku
            System.err.println(e.getMessage());
        }

        /**
         * wyjątek na wyszukanie w słowniku nie istniejacego slowa - zadanie2
         */
        Wypisz.tytul("Zadanie: wyszukiwanie nie istniejacego slowa");

        try {
            Dictionary dictionary = new DictionaryImpl();
            String word = dictionary.search("Queue");
            System.out.println(word);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

        /**
         * wyjątek na zwierzaka z imieniem pustym - null
         *
         */
        Wypisz.tytul("Zadanie: Zwierzak z imieniem pustym null");

        try {
            Zwierzak pupil = new Zwierzak(null);
            System.out.println(pupil);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
