package com.jimg.strategy.duck.fly.flyImpl;

import com.jimg.strategy.duck.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
