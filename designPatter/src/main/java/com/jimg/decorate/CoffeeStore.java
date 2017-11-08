package com.jimg.decorate;

import com.jimg.decorate.cd.Milk;
import com.jimg.decorate.cd.Mocha;
import com.jimg.decorate.coffee.DarkRoast;

public class CoffeeStore {
    public static void main(String[] args) {

        Beverage dark = new DarkRoast();
        Beverage milk = new Milk(dark);
        Beverage mocha = new Mocha(milk);
        System.out.println(mocha.getDescription() + " " + mocha.cost());
    }
}
