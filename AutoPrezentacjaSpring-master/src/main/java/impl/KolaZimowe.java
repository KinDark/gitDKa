package impl;

import api.IKola;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("kolazimowe")
// primary - bedzie tylko on dostepne ( w przypadku barku @Qualifier)

public class KolaZimowe implements IKola{
    @Override
    public String getType() {
        return "zimowe";
    }
}
