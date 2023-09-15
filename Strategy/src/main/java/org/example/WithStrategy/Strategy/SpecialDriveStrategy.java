package org.example.WithStrategy.Strategy;

public class SpecialDriveStrategy implements IDriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
