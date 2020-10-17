package pl.sdacademy.tarr2020java6.java.zaawansowana.zadania.lista;

import pl.sdacademy.tarr2020java6.java.zaawansowana.wyjatki.Sklep;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
public class Main {

    public static void main(String[] args){
        /**
         * Zadanie. Sprawdzanie na liście w sklepie czy jest dany produkt
         * Jeśli nie ma to wyjątek że nie ma nia liście produktów
         */
        try {
            Sklep biedronkaSklep = new Sklep();
            biedronkaSklep.poprosze("papier toaletowy");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
