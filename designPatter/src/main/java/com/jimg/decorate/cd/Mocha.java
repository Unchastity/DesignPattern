package com.jimg.decorate.cd;

import com.jimg.decorate.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Mocha, " + beverage.getDescription();
    }

    public double cost() {
        return 0.8 + beverage.cost();
    }
}
