package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza world!");

        //create a Margherita + Extra-cheese Pizza
        BasePizza margherita  = new ExtraCheese(new Margherita());
        System.out.println("The cost of Margherita + Extra-cheese : "+margherita.cost());

        //create a Farmhouse + Extra-cheese + Mushroom Pizza
        BasePizza farmhouse  = new ExtraCheese(new Mushroom(new Margherita()));
        System.out.println("The cost of Farmhouse + Extra-cheese + Mushroom : "+farmhouse.cost());

    }
}