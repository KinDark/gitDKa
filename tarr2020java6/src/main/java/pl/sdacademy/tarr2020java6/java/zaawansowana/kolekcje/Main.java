package pl.sdacademy.tarr2020java6.java.zaawansowana.kolekcje;

import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.Figura;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kolo;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kwadrat;
import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Elephant;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Lion;

import java.util.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Main {

    /**
     * Kolekcje
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Zadanie.
         *
         * 1.Podaj przyklady użyć poniższych kolekcji
         * Zaaragumentuj wybrane użycie
         *
         * 2. Co się stanie gdy usuniemy z kolejki ?
         * -- zostaje druga osoba czyli Grażyna
         *
         * 3.Czym się różni lista od zbioru ?
         * -- lista ma kolejnosc a zbiór nie,
         *
         * Przykłady:
         * - struktura Ksiązek -
         *      - Set zbiór książek
         *      - Map jeśli chce wyszukać np po ISBN
         * - struktura Stacji paliw
         *      - Set zbiór
         * - struktura słownika tłumaczeń
         *      - Map szukamy według klucza słowo
         * - struktura bazy ZUS ubezpieczonych
         *      - Map kluczem jest pesel lub nip
         * - struktura bazy PLUS telefonii
         *      - Map kluczem jest numer telefonu
         * - struktura ogłoszeń na allegro
         *      - List jeśli ważna jest kolejność dodawanych ogłoszeń
         *      - Set jeśli chcemy przechowywać ogłoszenia
         *      - Map jeśli kluczem jest numer ogłoszenia
         * - struktura kody pocztowe
         *      - Map kluczem jest kod
         * - struktura restauracji menu
         *      - List ważna jest kolejność pozycji w menu
         */

        // lista
        /**
         * indeks -> uczeń
         * w przypadku gdy lista jest pokolei
         * - kolejność
         */
        List list;
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion("Simba"));
        zoo.add(new Elephant("Dumbo"));
        // użycie listy w pętli

        Wypisz.tytul("Lista w pętli");
        for(Animal animal : zoo){
            System.out.printf("Zwierzak %s.\n",animal.getName());
        }

        // zbiór
        /**
         * - wspólne cechy-typ np Figura
         * - brak kolejności
         */
        Set zbior;
        Set<Figura> zbiorFigur = new HashSet<>();
        zbiorFigur.add(new Kwadrat(4));
        zbiorFigur.add(new Kolo(4));
        Wypisz.tytul("Zbiór w pętli");
        for(Figura figura : zbiorFigur){
            figura.wypiszNazwe();
        }

        // Map
        /**
         * klucze w mapie są unikalne
         */
        Map mapa;
        Map<Integer,String> mapaLiczb = new HashMap<>();
        mapaLiczb.put(1,"pierwszy");
        mapaLiczb.put(2,"drugi");
//        mapaLiczb.put(2,"wymyślony");
        Wypisz.tytul("Mapa w pętli");
        // entrySet() - metoda która zwraca Set czyli zbiór
        // zbiór klucz-wartość nie posiada kolejności
        for(Map.Entry<Integer,String> entry : mapaLiczb.entrySet()){
            // %d - liczba /digital
            // %s - napis /String
            System.out.printf("%d -> %s\n",entry.getKey(),entry.getValue());
        }

        // kolejka w kolejnosci dodawania
        Queue kolejka;
        Queue<String> kolejkaWBiedronce = new ArrayDeque<>();
        kolejkaWBiedronce.add("Janusz");
        kolejkaWBiedronce.add("Grażyna");
        Wypisz.tytul("Kolejka w pętli - for");
        for(String osoba : kolejkaWBiedronce){
            System.out.println(osoba);
        }
        Wypisz.tytul("Kolejka w pętli - for iterator ");

        // za pomocą iteratora
        Iterator iterator = kolejkaWBiedronce.iterator();

        for(Iterator i = iterator; i.hasNext();){
            System.out.println(i.next());
        }

        Wypisz.tytul("Kolejka w pętli - while iterator ");
        kolejkaWBiedronce.remove();

        iterator = kolejkaWBiedronce.iterator();// reset iteratora przypisanie na nowo
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //kolejkaWBiedronce.iterator().



    }
}
