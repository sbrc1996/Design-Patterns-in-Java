package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Pattern!");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
        System.out.println("Finally Order Created Successfully.");
    }
}