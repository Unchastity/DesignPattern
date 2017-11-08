package com.jimg.decorate.cd;

import com.jimg.decorate.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Whip, " + beverage.getDescription();
    }

    public double cost() {
        return 1.2 + beverage.cost();
    }
}
