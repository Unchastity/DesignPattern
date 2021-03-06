package com.jimg.strategy.duck;

import com.jimg.strategy.duck.fly.flyImpl.FlyWithWings;
import com.jimg.strategy.duck.quack.quackImpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("I'm mallard duck, and can swim");
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
