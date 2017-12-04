/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.weather;

import java.util.Observable;

/**
 *
 * @author jason
 */
public class WeatherData extends Observable {
    
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        
    }

    public void measurementsChanged() {
        //This method is required to notify the change
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
}
