package org.example;

import java.util.ArrayList;

public class WeatherData implements ISubject{
    private ArrayList<IObserver> observers;  //to maintain the 1 to many relationship.. and store all the Observers..
    private float temperature, pressure, humidity;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void addObserver(IObserver o) {
        observers.add(o);       //add a new Observer into the arrayList..
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);       //get the index of the current Observer..
        if( i>=0)
            observers.remove(i);            //remove the object from the obeserver list..
    }

    @Override
    public void notifyObservers() {
//        for(int i=0;i<observers.size();i++){         //update the details for every observer..
//            IObserver observer = (IObserver) observers.get(i);
//            observer.update(temperature,humidity,pressure);
//        }
        for(IObserver ob : observers)
            ob.update(temperature,humidity,pressure);
    }

    public void measurementsChanged(){                  //Once the state changes of the subject call notofyObserver..
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return this.temperature;
    }
    public float getHumidity(){
        return this.humidity;
    }
    public float getPressure(){
        return this.pressure;
    }
}
