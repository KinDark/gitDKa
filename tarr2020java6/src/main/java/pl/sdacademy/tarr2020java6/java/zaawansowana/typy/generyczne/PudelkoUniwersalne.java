package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class PudelkoUniwersalne<T> {

    public T pobierzZawartosc() {
        return zawartosc;
    }

    public void wloz(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    private T zawartosc;

    public PudelkoUniwersalne(){
    }

    public PudelkoUniwersalne(T przedmiot){
        this.zawartosc = przedmiot;
    }
}
