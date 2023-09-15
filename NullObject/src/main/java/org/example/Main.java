package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Null Object Pattern!");

        Vehicle vehicle = VehicleFactory.getVehicleObject("car");
        printVehicleDetials(vehicle);

        //this one handles the NULL object scenario..
        vehicle = VehicleFactory.getVehicleObject("dfjhdf");
        printVehicleDetials(vehicle);

    }
    private static void printVehicleDetials(Vehicle vehicle){
        System.out.println("Seating Capacity : " + vehicle.getSeat());
        System.out.println("Fuel Capacity : " + vehicle.getFuel());
    }
}