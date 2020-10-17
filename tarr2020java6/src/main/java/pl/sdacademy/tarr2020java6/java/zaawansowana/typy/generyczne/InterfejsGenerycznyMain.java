package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Lion;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class InterfejsGenerycznyMain {

    public static void main(String[] args) {
        Lion lew = new Lion("Król Lew");
        Frytki frytki = new Frytki();
        Lowca lowca = new Lowca();
        lowca.rozpoczecie();
        lowca.zlapanieDoKlatki(lew);
        //lowca.zlapanieDoKlatki(frytki);
    }
}
