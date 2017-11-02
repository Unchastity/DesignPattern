package com.jimg.strategy.duck;

import com.jimg.strategy.duck.fly.FlyBehavior;
import com.jimg.strategy.duck.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void swim();
    public abstract void display();
    public void perforFly() {
        flyBehavior.fly();
    }
    public void perforQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
