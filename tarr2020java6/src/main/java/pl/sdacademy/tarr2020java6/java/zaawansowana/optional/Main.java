package pl.sdacademy.tarr2020java6.java.zaawansowana.optional;

import pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje.JavaTopic;
import pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje.MainClass;

import java.util.Optional;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 06.06.2020
 **/
@JavaTopic(topic = "Programowanie funkcyjne", decription = "Optional")
public class Main extends MainClass {

    public Main(){
        super();
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    protected void implementacjaProgramu() throws Exception{
        System.out.println("Optional");

        Rower rower = new Rower("Romet Bike");
        Rower rowerPusty = null;

        //Optional optionalConstructor = new Optional(rower); forma nie poprawna
        Optional<Rower> optionalRower = Optional.ofNullable(rower);

        System.out.println("optional rower isPresent() : "+optionalRower.isPresent());

        if(optionalRower.isPresent()){// zamiast != null
            System.out.println("Jest rower!");
        }
    }

    public static void sprawdzRower(Rower rower){

        Optional<Rower> option = Optional.of(rower);
        if(option.isPresent()){
            System.out.println("jest na stanie");
        }else{
            System.out.println("brak");
        }
    }

    public static void sprawdzRowerBezOptional(Rower rower){

        if(rower != null){
            System.out.println("Rower jest na stanie");
        }else{
            System.err.println("Brak roweru na stanie!");
        }
    }
}
