/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import observerpattern.weather.WeatherData;
import observerpattern.weatherobserver.CurrentConditionsDisplay;
import observerpattern.weatherobserver.ForecastDisplay;
import observerpattern.weatherobserver.HeatIndexDisplay;
import observerpattern.weatherobserver.StatisticsDisplay;

/**
 *
 * @author jason
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("------------------Measurements changed-------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("------------------Measurements changed-------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("------------------Observer removed-------------------");
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
        
    }
    
}
