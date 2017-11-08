package com.jimg.decorate.coffee;

import com.jimg.decorate.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    public double cost() {
        return 5.0;
    }
}
