package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern!");

        AirConditioner airConditioner = new AirConditioner();
        RemoteControl rc = new RemoteControl();

        rc.setCommand(new TurnACOnCommand(airConditioner));
        rc.pressButton();

        rc.setCommand(new SetACTemperature(airConditioner));
        rc.pressButton();
        rc.undo();

        rc.setCommand(new TurnACOffCommand(airConditioner));
        rc.pressButton();
    }
}