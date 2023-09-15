package org.example;

import org.example.Adaptee.WeightMachineForBabies;
import org.example.Adapter.WeightMachineAdapter;
import org.example.Adapter.WeightMachineAdapterForBabies;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern!");
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterForBabies(new WeightMachineForBabies());
        System.out.println("The weight in Kg is : " + weightMachineAdapter.getWeightInKg());
    }
}