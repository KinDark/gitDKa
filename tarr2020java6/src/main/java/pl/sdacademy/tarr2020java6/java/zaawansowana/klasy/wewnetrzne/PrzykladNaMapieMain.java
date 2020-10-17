package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.wewnetrzne;

import pl.sdacademy.tarr2020java6.java.podstawy.Mlotek;
import pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna.Kot;
import pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna.KotMaurycy;

import java.util.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class PrzykladNaMapieMain {

    public static void main(String[] args) {
        List<String> innaLista = new LinkedList<>();// implementacja link
        List<String> listaMiast = new ArrayList<>();
        // czym się różni List od ArrayList ?
        // List to interfejs a ArrayList to implementacja List

        // lista różnych obiektów
        List roznychObiektow = new LinkedList();
        roznychObiektow.add(new KotMaurycy("Maurycy"));
        roznychObiektow.add(new Mlotek());
        roznychObiektow.add(5);
        roznychObiektow.add(false);
        roznychObiektow.add("Napis");
        roznychObiektow.add(listaMiast);
        System.out.println("Lista roznychObiektow:");
        for(Object element : roznychObiektow){
            // przechodzenie po elementach listy
            System.out.println(element);
        }
        //String miastoZlistyMiast = ((List<String>)roznychObiektow.get(5)).get(1);
        // remove 0 czyli pierwsze miasto
        //((List<String>)roznychObiektow.get(5)).remove(0);


        // w przypadku listy wypisanie elementów
        List<String> listaObecnosci = new ArrayList<>();
        // Arrays to klasa posiadajaca metode asList
        // metoda asList tworzy liste, mozemy dodawac po przecinku
        listaObecnosci.addAll(Arrays.asList("Jan","Julia","Janusz"));
        System.out.println("Lista obecnosci:");
        for(String imie : listaObecnosci){
            // przechodzenie po elementach listy
            System.out.println(imie);
        }

        /**
         * Mapa element z kolekcji posiada klucz i wartość np. kod pocztowy -> miasto
         * kluczem jest kod pocztowy i po kodzie możemy pobrać nazwę miasta
         */
        // Map<Klucz,Wartosc>
        Map<Integer,String> mapaLiczb = new HashMap<>();
        mapaLiczb.put(1,"pierwszy");
        mapaLiczb.put(2,"drugi");
        mapaLiczb.put(3,"trzeci");
        mapaLiczb.put(4,"czwarty");

        // pobranie wartości z mapy
        System.out.println("\nJesteś "+mapaLiczb.get(4)+" w kolejce!");


        // iteracja po mapie
        System.out.println("\niteracja po mapie liczb:");
        // Set - zbiór entry
        // entrySet - zbiór entry
        // Entry - interfejs posiadajacy metody getKey() oraz getValue()
        for(Map.Entry<Integer,String> entry : mapaLiczb.entrySet()){
            Integer klucz = entry.getKey();
            String wartosc = entry.getValue();
            System.out.println("     klucz="+klucz+"   wartosc="+wartosc);
        }

        /**
         *  Mapy używamy do przechowywania danych
         *  zawierających klucz -> wartość
         */


    }


}
