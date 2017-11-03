package com.jimg.observe.weather;

import com.jimg.observe.Observe;
import com.jimg.observe.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observe> observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observes = new ArrayList<Observe>();
    }

    public void registerObserve(Observe o) {
        observes.add(o);
    }

    public void removeObserve(Observe o) {

        int i = observes.indexOf(o);
        if (i >= 0) {
            observes.remove(i);
        }
    }

    public void notifyAllObserves() {
        for (int i = 0; i < observes.size(); ++i) {
            Observe observe = observes.get(i);
            observe.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyAllObserves();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
