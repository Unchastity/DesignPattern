package com.jimg.strategy.duck.simulator;

import com.jimg.strategy.duck.Duck;
import com.jimg.strategy.duck.MallardDuck;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.swim();
    }
}
