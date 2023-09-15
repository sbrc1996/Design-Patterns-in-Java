package org.example.WithStrategy;

import org.example.WithStrategy.Strategy.IDriveStrategy;

public class Vehicle {
    IDriveStrategy driveObject;     //we are not initializing the object type, then we have to write more code..

    //this is called constructor injection..
    Vehicle(IDriveStrategy ob){
        this.driveObject = ob;
    }

    public void drive(){
        driveObject.drive();
    }

}
