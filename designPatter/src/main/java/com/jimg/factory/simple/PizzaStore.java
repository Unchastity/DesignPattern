package com.jimg.factory.simple;

public class PizzaStore {

    public Object orderPizza(String type) {
        Object product = new SimplePizzaFactory().createPizza();
        //TODO 不变的部分


        return product;
    }
}
