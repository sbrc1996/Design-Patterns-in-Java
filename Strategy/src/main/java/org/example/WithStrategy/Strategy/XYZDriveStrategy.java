package org.example.WithStrategy.Strategy;

public class XYZDriveStrategy implements IDriveStrategy{
    @Override
    public void drive() {
        System.out.println("XYZ Drive Capability");
    }
}
