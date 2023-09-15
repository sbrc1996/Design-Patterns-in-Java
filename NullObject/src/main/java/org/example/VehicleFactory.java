package org.example;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle){
        if("car".equals(typeOfVehicle))
            return new Car();
        else
            return new NullObj();
    }

}
