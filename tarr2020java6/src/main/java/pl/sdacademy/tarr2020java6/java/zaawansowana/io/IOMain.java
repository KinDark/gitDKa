package pl.sdacademy.tarr2020java6.java.zaawansowana.io;

import java.io.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class IOMain {

    public static void main(String[] args) {


        /**
         * Uwaga na pulpicie stwórz pliki : plik0.txt oraz plik1.txt
         */
        String lokalizacja = "C:\\Users\\trener\\Desktop\\";

        try {

            FileReader in = new FileReader(lokalizacja+"plik0.txt");
            FileWriter out = new FileWriter(lokalizacja+"plik1.txt");

            copy(in, out);

            // zamykanie otwartych reader writer
            in.close();
            out.close();

            String message = "Wakacje nad morzem!";
            StringReader reader = new StringReader(message);
            FileWriter out2 = new FileWriter(lokalizacja+"plik2.txt");

            copy(reader, out2);

            reader.close();
            out2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Kopiowanie znak po znaku (char-c)
     *
     * @param reader
     * @param writer
     * @throws IOException
     */
    private static void copy(Reader reader, Writer writer) throws IOException {
        int c; // char czyli znak
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
    }
}

