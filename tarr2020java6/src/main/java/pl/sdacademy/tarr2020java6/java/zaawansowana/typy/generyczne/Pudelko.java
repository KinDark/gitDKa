package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Pudelko {

    private Frytki zawartosc;

    public void wloz(Frytki wkladaneFrytki) {
        this.zawartosc = wkladaneFrytki;
        System.out.println("Do pudełka trafia :"+
                wkladaneFrytki.getClass().getSimpleName().toLowerCase());
    }
}
