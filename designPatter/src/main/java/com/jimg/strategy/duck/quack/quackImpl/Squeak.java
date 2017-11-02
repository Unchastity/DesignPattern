package com.jimg.strategy.duck.quack.quackImpl;

import com.jimg.strategy.duck.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack with squeak");
    }
}
