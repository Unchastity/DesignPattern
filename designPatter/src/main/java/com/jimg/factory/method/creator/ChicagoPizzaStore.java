package com.jimg.factory.method.creator;

import com.jimg.factory.method.product.ChicagoStyleCheesePizza;
import com.jimg.factory.method.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
