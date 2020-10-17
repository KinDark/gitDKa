package pl.sdacademy.tarr2020java6.java.zaawansowana.zadania.zwierzak;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
public class Zwierzak {
    private String imie;

    public Zwierzak(String imie) {
        if(imie == null){
            throw new IllegalArgumentException("Imie nie moze być 'null'!");
        }
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Zwierzak{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
