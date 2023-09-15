package org.example;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 24;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println("Ac is on!!");
    }
    public void turnOff(){
        this.isOn = false;
        System.out.println("Ac is off!!");
    }
    public void setTemperature(int temp){
        this.temperature = temp;
    }
    public void unSetTemperature(){ this.temperature = 24;}
}
