package pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury;

import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.Figura;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Trojkat extends Figura {

    int a,b,h;

    private Trojkat(){
        nazwa = "Trojkat";
    }

    public Trojkat(int a,int b ,int h){
        this();// wywolanie konstruktora domyślnego
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public float obliczPole() {
        return a*h/2;
    }

    @Override
    public float obliczObwod() {
        return a+b+h;
    }
}
