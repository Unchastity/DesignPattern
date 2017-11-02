package com.jimg.duck.quack.quackImpl;

import com.jimg.duck.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
