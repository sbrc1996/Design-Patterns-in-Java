package org.example.WithStrategy.Strategy;

public class NormalDriveStrategy implements IDriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
