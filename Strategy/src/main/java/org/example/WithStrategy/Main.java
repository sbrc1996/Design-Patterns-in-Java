package org.example.WithStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern!");

        Vehicle v = new PassengerVehicle();
        v.drive();

        v = new OffRoadVehicle();
        v.drive();

        v = new SportyVehicle();
        v.drive();
    }
}
