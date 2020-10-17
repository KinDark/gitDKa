package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class DictionaryImpl implements Dictionary {

    private final WordData wordData;

    /**
     * Klasa wewnętrzna zawierająca dane do słownika
     */
    public static class WordData extends HashMap<String,String> {

        // konstruktor pod klasy
        public WordData(){
            super();// dlaczego tutaj jest super ?
            put("window","okno");
            put("english","angielski");
        }

        public void importCSV(String csvPath) throws IOException {
            Path source = Paths.get(csvPath);
            List<String> linesFromFile = Files.readAllLines(source);
            for(String line:linesFromFile) {
                String[] columns = line.split(",");
                put(columns[0],columns[1]);// liczymy od zera
            }
        }
    }

    @Override
    public String search(String word) {
        String result = wordData.get(word.toLowerCase());
        if(result == null){
            throw new RuntimeException("Brak tłumaczenia słowa '"+word+"' !");
        }
        return result;
    }

    // konstruktor nad klasy
    public DictionaryImpl(){
        wordData = new WordData();
    }

    public DictionaryImpl(WordData wordData){
        this.wordData = wordData;
    }
}
