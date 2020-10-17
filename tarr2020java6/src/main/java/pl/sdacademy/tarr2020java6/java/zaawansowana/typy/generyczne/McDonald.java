package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class McDonald {

    public Frytki poproszeFrytki(){
        System.out.println("McDonald: proszę o to Twoje frytki...");
        return new Frytki();
    }

    public McFlury poproszeMcFlury() {
        System.out.println("McDonald: proszę o to Twoje frytki...");
        return new McFlury();
    }
}
