package impl;

import api.IKola;
import api.ISilnik;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Auto {
    private String nazwa;
    private ISilnik silnik;
    private IKola kola;

// konst z podpowiedzia nazwy - value, silnik i kola ma bean
    public Auto(@Value("Audi") String nazwa, ISilnik silnik,
                IKola kola) {
        this.nazwa = nazwa;
        this.silnik = silnik;
        this.kola = kola;
    }

    public void prezentacjaAuta(){
        System.out.println("Model auta to:"+ nazwa+" ,silnik to: "
                +silnik.getType()+" ,typ kół: "+kola.getType());
    }

}
