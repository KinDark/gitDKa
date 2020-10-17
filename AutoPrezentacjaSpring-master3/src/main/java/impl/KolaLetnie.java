package impl;

import api.IKola;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

// wskazujemy resources
@PropertySource("auto.properties")
@Component
@Primary
public class KolaLetnie implements IKola {

    //czytamy wartosc z pliku
    @Value("${kola.letnie}")
    String typ;

    @Override
    public String getType() {
        return typ;
    }
}
