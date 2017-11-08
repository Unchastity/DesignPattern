package com.jimg.factory.method.creator;

import com.jimg.factory.method.product.Pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {

        Pizza pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //工厂方法
    abstract Pizza createPizza(String type);
}
