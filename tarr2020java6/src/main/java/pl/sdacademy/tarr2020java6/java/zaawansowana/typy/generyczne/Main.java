package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;

import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Main {

    public static void main(String[] args) {

        McDonald mcDonaldNaStarowce = new McDonald();
        Frytki frytki = mcDonaldNaStarowce.poproszeFrytki();

        Pudelko pudelkoNaFrytki = new Pudelko();
        pudelkoNaFrytki.wloz(frytki);

        McFlury mcFlury = mcDonaldNaStarowce.poproszeMcFlury();

        // typ generyczny
        PudelkoUniwersalne<McFlury> pudelkoNaLody = new PudelkoUniwersalne();
        pudelkoNaLody.wloz(mcFlury);

        McFlury zawartosc = pudelkoNaLody.pobierzZawartosc();

        // typ generyczny
        List<McFlury> listaProduktow;// podobienstwo do
        // pudełko uniwersalne

        // typ generyczny
        MojaMapa<Miejsce, Animal> mapaZwierzat;
    }
}
