package impl;

import api.ISilnik;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("silnikgas")
// primary - bedzie tylko on dostepne ( w przypadku barku @Qualifier)
@Primary
public class SilnikGas implements ISilnik {
    @Override
    public String getType() {
        return "benzin";
    }
}
