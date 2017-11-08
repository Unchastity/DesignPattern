package com.jimg.factory.method;

import com.jimg.factory.method.creator.ChicagoPizzaStore;
import com.jimg.factory.method.creator.NYPizzaStore;
import com.jimg.factory.method.creator.PizzaStore;
import com.jimg.factory.method.product.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("nyPizza: " + nyPizza.getName());

    }
}
