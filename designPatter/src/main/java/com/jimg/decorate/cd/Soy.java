package com.jimg.decorate.cd;

import com.jimg.decorate.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Soy, " + beverage.getDescription();
    }

    public double cost() {
        return 0.9 + beverage.cost();
    }
}
