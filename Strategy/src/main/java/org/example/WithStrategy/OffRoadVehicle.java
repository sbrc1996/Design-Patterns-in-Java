package org.example.WithStrategy;

import org.example.WithStrategy.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }

}
