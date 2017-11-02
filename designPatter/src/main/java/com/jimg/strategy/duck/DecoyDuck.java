package com.jimg.strategy.duck;

import com.jimg.strategy.duck.fly.flyImpl.FlyWithWings;
import com.jimg.strategy.duck.quack.quackImpl.Quack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("I'm a decoy duck, and can swim");
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
