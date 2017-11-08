package com.jimg.decorate.coffee;

import com.jimg.decorate.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend";
    }
    public double cost() {
        return 7.0;
    }
}
