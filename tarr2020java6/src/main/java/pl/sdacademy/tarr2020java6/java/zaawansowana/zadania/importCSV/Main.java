package pl.sdacademy.tarr2020java6.java.zaawansowana.zadania.importCSV;

import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2.Dictionary;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2.DictionaryImpl;

import java.io.File;
import java.io.IOException;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
public class Main {

    public static void main(String[] args) {
        Wypisz.tytul("Zadanie: Import z CSV do słownika");
        // plik csv
        // otwarcie pliku - przeczytanie
        // dodanie do wordData

        DictionaryImpl.WordData wordData = new DictionaryImpl.WordData();
        try {
            wordData.importCSV("D:\\projects\\sdacademy.pl\\TARR2020Java6\\git\\tarr2020java6\\src\\main\\resources\\words.csv");
        } catch (IOException e) {
            System.err.println("Błąd importu CSV:"+e.getMessage());
        }
        Dictionary dictionary = new DictionaryImpl(wordData);
        String word = dictionary.search("ball");
        System.out.println("Znaleziono:"+word);
    }
}
