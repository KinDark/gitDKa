package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.wyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public enum FormatPapieru {
    A1(123,234),A2(345,456),A3(567,678),A4(789,890);

    FormatPapieru(int wysokosc, int szerokosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }

    public int pobierzWysokosc() {
        return wysokosc;
    }

    public int pobierzSzerokosc() {
        return szerokosc;
    }

    private int wysokosc, szerokosc;

    @Override
    public String toString() {
        return "FormatPapieru{" +
                "wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                '}';
    }
}
