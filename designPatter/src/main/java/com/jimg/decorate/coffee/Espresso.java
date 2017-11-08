package com.jimg.decorate.coffee;

import com.jimg.decorate.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }
    public double cost() {
        return 4.0;
    }
}
