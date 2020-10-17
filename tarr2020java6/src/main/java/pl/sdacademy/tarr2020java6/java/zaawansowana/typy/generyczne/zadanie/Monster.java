package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne.zadanie;



/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Monster extends Plant {

    public boolean potrzebneWzmocnienie() {
        return wzmocnienie;
    }

    boolean wzmocnienie;

    public Monster(){
        super("Monster");
        wzmocnienie = true;
    }

    public Monster(String name) {
        super(name);
    }
}
