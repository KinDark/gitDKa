package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.plants;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Plant {

    public Plant(String name) {
        this.name = name;
        System.out.println("Rośnie... "+name);
    }

    private String name;


    public String getName() {
        return name;
    }
}
