package impl;

import api.IOrder;
import api.IPizza;

public class MyOrder {

    public class MyOrder implements IOrder {
        IPizza pizza;

        public MyOrder(IPizza pizza) {
            this.pizza = pizza;
        }

        public void pritOrder(){

        }
    }
}
