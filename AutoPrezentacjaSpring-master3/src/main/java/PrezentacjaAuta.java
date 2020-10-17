import config.Config;
import impl.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Zadanie na podsumowanie wiedzy ze Spring core.
 * Projekt ma używać konfiguracji z klasą i ComponentScan. Biny mają być zdefiniowane w klasach.
 * Program ma testować auta.
 * Interfejsy: ISilnik ma mieć metodę String getType zwracającą typ silnika
 *                    IKola ma mieć metodę String getType zwracającą typ kół
 * Klasa Auto:
 *  pola nazwa, silnik, kola
 * Klasa SilnikDiesel, SilnikGas
 * Klasa KolaZimowe, KolaLetnie
 * Klasa PrezentacjaAuta ma mieć metodę prezentujAuto która ma wypisać na ekranie nazwę auta, typ silnika i typ kół
 */
public class PrezentacjaAuta {
    public static void main(String[] args) {

        //SilnikDiesel silnik = new SilnikDiesel();
        //SilnikGas silnik = new SilnikGas();

        //KolaLetnie kola = new KolaLetnie();
        //KolaZimowe kola = new KolaZimowe();

        //Auto auto = new Auto("BMW", silnik, kola);
        //auto.prezentacjaAuta();

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Auto auto = context.getBean("auto", Auto.class);
        auto.prezentacjaAuta();

    }
}
