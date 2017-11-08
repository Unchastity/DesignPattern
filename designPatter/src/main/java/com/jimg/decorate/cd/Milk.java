package com.jimg.decorate.cd;

import com.jimg.decorate.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {

        this.beverage = beverage;
    }

    public String getDescription() {
        return "Milk, " + beverage.getDescription();
    }

    public double cost() {
        return 0.8 + beverage.cost();
    }
}
