package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne.zadanie;


/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Doniczka<R extends Plant> {

    private Class<R> typ;

    public Doniczka(R zawartosc) {
        this.zawartosc = zawartosc;
    }

    public Doniczka(Class<R> typ){
        this.typ = typ;
    }

    public void zasadz(R roslina){
        // sprawdz czy roslina pasuje do doniczki
        String rodzajDoniczki = typ.getSimpleName();
        String rodzajRosliny = roslina.getClass().getSimpleName();

        if(!rodzajDoniczki.equalsIgnoreCase(rodzajRosliny)){
            System.err.println("Doniczka nie pasuje, bo jest na "+rodzajDoniczki);
        }else{
            this.zawartosc = roslina;
            System.out.println("do doniczki trafia "+roslina.getName().toLowerCase());

            if(roslina instanceof Monster &&
                    ((Monster) roslina).potrzebneWzmocnienie())
            {
                System.out.println(roslina.getName()+" potrzebuje wzmocnienia!");
            }
        }


    }

    public Doniczka(){

    }

    R zawartosc;


    @Override
    public String toString() {
        return "doniczka na " + zawartosc.getClass().getSimpleName();

    }
}
