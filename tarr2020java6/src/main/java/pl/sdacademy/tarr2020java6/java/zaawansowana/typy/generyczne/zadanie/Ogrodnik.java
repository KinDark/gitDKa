package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne.zadanie;


/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Ogrodnik implements PraceOgrodnika{

    @Override
    public void sadzenie(Plant roslina, Doniczka doniczka) {
        doniczka.zasadz(roslina);
    }
}
