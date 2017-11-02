package com.jimg.duck;

import com.jimg.duck.fly.flyImpl.FlyWithWings;
import com.jimg.duck.quack.quackImpl.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("I'm a red head duck, and can swim");
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}