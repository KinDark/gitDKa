package impl;

import api.ISilnik;
import org.springframework.stereotype.Component;

@Component
public class SilnikDiesel implements ISilnik {
    @Override
    public String getType() {
        return "diesel";
    }
}
