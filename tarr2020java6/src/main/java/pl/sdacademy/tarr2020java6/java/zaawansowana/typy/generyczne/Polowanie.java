package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public interface Polowanie<A extends Animal> {

    public void rozpoczecie();

    public void zlapanieDoKlatki(A animal);
}
