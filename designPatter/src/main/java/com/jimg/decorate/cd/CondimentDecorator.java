package com.jimg.decorate.cd;

import com.jimg.decorate.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
