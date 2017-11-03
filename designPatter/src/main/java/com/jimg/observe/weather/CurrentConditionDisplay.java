package com.jimg.observe.weather;

import com.jimg.observe.Observe;
import com.jimg.observe.Subject;

public class CurrentConditionDisplay implements Observe, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println(this.getClass().getName() + ":");
        System.out.println("temperature: " + this.temperature + "\nhumidity: " + this.humidity + "\npressure: " + this.pressure);
    }
}
