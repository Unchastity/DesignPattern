package com.jimg.factory.abstrac;

public interface PizzaIngredientFactory {

    public Object createDough();
    public Object createSauce();
    public Object createCheese();
    public Object[] createVeggies();
    public Object createPepperoni();
    public Object createClam();
}
