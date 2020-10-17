package pl.sdacademy.tarr2020java6.java.zaawansowana.klasy.wewnetrzne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class WewnetrzneMain {

    public static void main(String[] args) {

        Mysz mickey = new Mysz("Mickey");
        mickey.zbierz("ser");
        mickey.pokazZbiory();

        System.out.println("\n--- kot zabiera zbiory puste ---\n");
        // zbiory stworzone przez metodę
        // stworzZbiory - wymagają utworzenia wcześniej
        // myszy
        Mysz.Zbiory zbioryKota = mickey.stworzZbiory("Nowe zbiory kota");
        zbioryKota.wypisz();

        System.out.println("\n--- kot zabiera zbiory myszy ---\n");
        zbioryKota = mickey.zabierzZbiory();
        zbioryKota.wypisz();

        // statyczne zbiory nie wymagają utworzenia
        // obiektów do utworzenia zbiorów
        // nie wymagaja utworzenia myszy
        Mysz.Zbiory zbiory = Mysz.stworzZbioryBezMyszy("Zbiory bez myszy");

        //int a=1;int c=5+a;System.out.println(c);


    }
}
