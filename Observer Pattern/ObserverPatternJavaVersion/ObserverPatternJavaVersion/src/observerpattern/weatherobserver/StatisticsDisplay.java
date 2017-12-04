/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.weatherobserver;

import java.util.Observable;
import java.util.Observer;
import observerpattern.interfaces.DisplayElement;
import observerpattern.weather.WeatherData;

/**
 *
 * @author jason
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            tempSum += weatherData.getTemperature();
            numReadings++;

            if (weatherData.getTemperature() > maxTemp) {
                maxTemp = weatherData.getTemperature();
            }

            if (weatherData.getTemperature() < minTemp) {
                minTemp = weatherData.getTemperature();
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
