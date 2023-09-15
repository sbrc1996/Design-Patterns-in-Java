package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");

        ComputerFactory computerFactory1 = new PolandComputerFactory();
        Server newServer1 = computerFactory1.createServer();
        Laptop newLaptop1 = computerFactory1.createLaptop();
        newServer1.runPingTest();
        newLaptop1.runTests();

        ComputerFactory computerFactory2 = new USComputerFactory();
        Server newServer2 = computerFactory2.createServer();
        Laptop newLaptop2 = computerFactory2.createLaptop();
        newServer2.runPingTest();
        newLaptop2.runTests();
    }
}
