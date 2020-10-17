package pl.sdacademy.tarr2020java6.java.zaawansowana.nio;

import org.openjdk.jmh.util.FileUtils;
import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 *
 **/
public class NIOMain {

    public static void main(String[] args) {
        String rootPath = "C:/Users/trener/Desktop/";
        Path source = Paths.get(rootPath+"plik0.txt");

        try {
            BasicFileAttributes attributes = Files.readAttributes(source,BasicFileAttributes.class);
            List<String> linesFromFile = Files.readAllLines(source);
            Wypisz.tytul("Zawartość pliku :"+source.getFileName());
            System.out.println("Size: "+attributes.size()+" bytes");

            int counter = 0;
            for(String line:linesFromFile){
                System.out.println(counter+"|"+line);
                // zamiana słowa Pies na Lalka w pliku w danej linii
                if(line.contains("Pies")){
                    String zamienionaLinia=linesFromFile.get(counter).replace("Pies","Lalka!!!");
                    linesFromFile.set(counter,zamienionaLinia);
                }
                counter++;
            }


//            byte[] bytes = linesFromFile.get(0).getBytes();
//            Files.write(source, bytes);
            Files.write(source, linesFromFile, StandardCharsets.UTF_8);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
