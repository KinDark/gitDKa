package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.abstrakcyjna;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class KlasaAbstrakcyjnaMain {

    public static void main(String[] args) {

        KotBonifacy bonifacy = new KotBonifacy("Bonifacy");
        KotMaurycy maurycy = new KotMaurycy("Maurycy");

        bonifacy.drapanie();
        maurycy.drapanie();

        /**
         * Dzięki temu że mamy interfejs DzwiekiKota
         * możemy zrobić liste nagrań
         */

        System.out.println("\n\n--- lista nagrań ---\n");
        List<DzwiekiKota> listaNagran = new ArrayList();
        listaNagran.add(bonifacy);
        listaNagran.add(maurycy);
        for(DzwiekiKota dzwiekiKota: listaNagran){
            dzwiekiKota.mruczenie();
        }

    }
}
