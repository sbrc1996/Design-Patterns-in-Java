package org.example.WithoutStrategy;

import org.example.WithoutStrategy.OffRoadVehicle;
import org.example.WithoutStrategy.PassengerVehicle;
import org.example.WithoutStrategy.SportyVehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Without Strategy Pattern");
        PassengerVehicle p = new PassengerVehicle();
        p.drive();

        OffRoadVehicle o = new OffRoadVehicle();
        o.drive();

        SportyVehicle s = new SportyVehicle();
        s.drive();

        //The problem here is that we are doing code duplication in the OffRoad and SportyVehicle.

    }
}