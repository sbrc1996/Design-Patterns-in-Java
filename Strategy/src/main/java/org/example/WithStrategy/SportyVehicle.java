package org.example.WithStrategy;

import org.example.WithStrategy.Strategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
