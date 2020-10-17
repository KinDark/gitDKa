package pl.sdacademy.tarr2020java6.java.podstawy.powtorka;

import pl.sdacademy.tarr2020java6.java.podstawy.Mlotek;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class Pomocnik {



    /**
     * Domyślny bez argumentowy konstruktor
     */
    public Pomocnik(){

    }

    /**
     * Metoda dajNowyMlotek() daje nowy młotek
     */
    public Mlotek dajNowyMlotek(){
        return new Mlotek("zielony");
    }


}
