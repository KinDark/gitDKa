package pl.sdacademy.tarr2020java6.java.zaawansowana.zadania.ulamki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
public class Ulamek {

    int licznik;
    int mianownik;

    public Ulamek(int licznik, int mianownik) {
        if(mianownik==0){
            // zrzuć wyjątek
            throw new IllegalArgumentException("Mianownik nie może być równy 0!");
        }
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }



}
