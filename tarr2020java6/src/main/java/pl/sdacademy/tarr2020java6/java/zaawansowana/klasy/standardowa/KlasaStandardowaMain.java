package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.standardowa;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.plants.Plant;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class KlasaStandardowaMain {

    public static void main(String[] args) {
        Pies szarik = new Pies("Szarik");
        Drzewo kij = new Drzewo("Drzewo");
        szarik.aport(kij);
    }
}
