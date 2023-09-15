package org.example;

public class WeatherStation {
    public static void main(String[] args) {
        System.out.println("Welcome to Weather Station using Observer Pattern..");

        WeatherData w = new WeatherData();
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(w);
        StatisticsDisplay s = new StatisticsDisplay(w);
        ForecastDisplay f = new ForecastDisplay(w);

        w.setMeasurements(80,65,30.2f);
        w.setMeasurements(82,61,29.2f);
        w.setMeasurements(85,87,28.2f);
    }
}