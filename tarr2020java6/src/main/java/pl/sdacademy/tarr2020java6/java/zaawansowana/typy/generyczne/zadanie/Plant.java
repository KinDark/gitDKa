package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne.zadanie;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Plant {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plant(String name) {
        this.name = name;
    }

    String name;
}
