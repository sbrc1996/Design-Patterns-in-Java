package org.example.Adapter;

import org.example.Adaptee.WeightMachine;

public class WeightMachineAdapterForBabies implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeightMachineAdapterForBabies(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weight = weightMachine.getWeightInPound();
        double weightInKg =  weight * 0.45;
        return weightInKg;
    }
}
