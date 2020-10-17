package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.wyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Main {

    public static void main(String[] args) {
        Plec plecMezczyzny = Plec.MEZCZYZNA;
        Plec plecKobiety = Plec.KOBIETA;

        // poniżej możemy poplenić błąd
        String mezczyzna = "meszczyzna";
        String kobieta = "kobieta";
        kobieta = "kobitka";

        Plec wprowadzonaPlec = Plec.KOBIETA;
        switch (wprowadzonaPlec){
            case MEZCZYZNA:
                System.out.println("M");
                break;
            case KOBIETA:
                System.out.println("K");
                break;
        }

        /**
         * Przykład.
         * Koszulki i wielkosci rozmiaru
         */
        TshirtSize rozmiarKoszulkiM = TshirtSize.M;
        int szerokoscM = rozmiarKoszulkiM.getWidth();
        System.out.println(rozmiarKoszulkiM);

        /**
         * Zadanie.
         * Stworzeniu enum FormatPapieru
         * A1, A2, A3, A4
         * posiada metody:
         * - pobierzWyskosc
         * - pobierzSzerokosc
         */
        FormatPapieru papierA4 = FormatPapieru.A4;
        System.out.println(papierA4);

    }
}
