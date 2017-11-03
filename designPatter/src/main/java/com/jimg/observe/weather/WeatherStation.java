package com.jimg.observe.weather;

public class WeatherStation {
    public static void main(String[] args) {

        CurrentConditionDisplay display = new CurrentConditionDisplay();

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserve(display);
        weatherData.setMeasurements(30, 10, (float)0.8);
    }
}
