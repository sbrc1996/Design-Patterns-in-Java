package org.example;

public class Car implements Vehicle{
    @Override
    public int getSeat() {
        return 4;
    }

    @Override
    public int getFuel() {
        return 14;
    }
}
