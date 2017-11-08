package com.jimg.decorate.coffee;

import com.jimg.decorate.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf";
    }

    public double cost() {
        return 6.0;
    }
}
