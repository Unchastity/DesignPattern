package com.jimg.factory.method.creator;

import com.jimg.factory.method.product.NYStyleCheesePizza;
import com.jimg.factory.method.product.NYStyleVeggiePizza;
import com.jimg.factory.method.product.Pizza;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
