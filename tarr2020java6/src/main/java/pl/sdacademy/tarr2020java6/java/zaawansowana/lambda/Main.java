package pl.sdacademy.tarr2020java6.java.zaawansowana.lambda;

import pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje.JavaTopic;
import pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje.MainClass;
import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
@JavaTopic(topic = "Programowanie funkcyjne", decription = "Lambda")
public class Main extends MainClass {
    public static void main(String[] args) {
        new Main();
    }

    @Override
    protected void implementacjaProgramu() throws Exception {

        Wypisz.tytul("Wersja bez lambdy");

        LiczbaPi liczbaPiBezLambdy = new LiczbaPi() {
            @Override
            public float get() {
                return 3.141592f;
            }
        };
        System.out.println(liczbaPiBezLambdy.get());

        Wypisz.tytul("Wersja z lambdą");
        LiczbaPi liczbaPiLambda = () -> 3.141592f;
        System.out.println(liczbaPiLambda.get());

        Wypisz.tytul("Lambda z parametrem");
        PytanieParzystosc pytanie1 = new PytanieParzystosc() {
            @Override
            public boolean czyJest(int liczba) {
                return liczba % 2 == 0;
            }
        };

        PytanieParzystosc pytanie2 = liczba -> (liczba % 2) == 0;
        System.out.println(pytanie2.czyJest(4));


        Wypisz.tytul("Bez Lambda z 2 parametrami");

        Liczby liczbyAnonimowe = new Liczby() {
            @Override
            public int dodaj(int a, int b) {
                return a + b;
            }
        };

        Liczby liczbyNieAnonimowe = new LiczbyNieAnonimowe();

        Liczby liczbyLambda = (a,b) -> a + b;

        System.out.println(liczbyNieAnonimowe.dodaj(3, 5));
        System.out.println(liczbyAnonimowe.dodaj(9, 5));


        /**
         * Zadanie: Utwórz na 3 sposoby weryfikację czy
         * suma 2 liczb jest większa od 100
         */


    }
}
