package org.example.WithStrategy;

import org.example.WithStrategy.Strategy.NormalDriveStrategy;
import org.example.WithStrategy.Strategy.SpecialDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
