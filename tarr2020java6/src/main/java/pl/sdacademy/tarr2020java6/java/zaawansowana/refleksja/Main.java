package pl.sdacademy.tarr2020java6.java.zaawansowana.refleksja;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Lion;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Squirrel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 21.05.2020
 **/
public class Main {

    public static void main(String[] args) {
        // bez refleksji
        Lion simba = new Lion("Simba");
        simba.eat(new Squirrel("Wiewióreczka"));

        // z refleksją
        Class klasaLion = null;// deklaracja klasy
        try {
            klasaLion = Class.forName("pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Lion");
            // inicjalizacja klasy Lion

            Constructor constructor = Lion.class.getConstructor(String.class);// pobranie konstruktora z klasy Lion
            Lion king = (Lion)constructor.newInstance("King"); // tworzymy nową instacje klasy
            // z użyciem konstruktora pobranego wcześniej
            System.out.println(king.getName());

            Method method = klasaLion.getMethod("eat", Animal.class); // pobieramy metodę z klasy Lion

            // wywołanie metody eat pobranej wyżej
            method.invoke(klasaLion.getDeclaredConstructor(String.class).newInstance("Lew"),new Squirrel("Ruda"));

            //method.invoke(new Lion("Simba"),new Squirrel(""));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
