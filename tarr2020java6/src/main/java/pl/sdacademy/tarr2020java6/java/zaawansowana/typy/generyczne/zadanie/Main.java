package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne.zadanie;

import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Main {

    public static void main(String[] args) {
        /**
         * Zadanie.
         *
         * Main:
         * Ogrodnik, który sadzi rośliny w doniczki i podlewa
         *
         * Klasy:
         * - Ogrodnik - klasa
         * - PraceOgrodnika - interfejs <> rozszerzający Plant
         *      * sadzenie
         *      * podlewanie
         *      * zbieranieOwocow
         * - Doniczka - klasa generyczna extends Plant
         *
         */
        Monster roslinaMonster = new Monster();
        Ogrodnik januszOgrodnik = new Ogrodnik();
        Doniczka<Monster> doniczka = new Doniczka<>(Monster.class);
        Doniczka<Grass> doniczkaNaTrawe = new Doniczka<>(Grass.class);
        //Doniczka<Frytki> doniczkaZFrytkami;// nie działa bo extends Plant
        Wypisz.tytul("Ogrodnik sadzi monstera");
        januszOgrodnik.sadzenie(roslinaMonster,doniczka);
        Wypisz.tytul("Ogrodnik sadzi trawe");
        januszOgrodnik.sadzenie(new Grass("trawa"),doniczka);
    }
}
