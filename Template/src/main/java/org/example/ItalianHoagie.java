package org.example;

public class ItalianHoagie extends Hoagie{
    public ItalianHoagie() {
        this.wantCheese = true;
        this.wantMeat = true;
        this.wantVeggies = true;
    }

    String[] meatTypes= {"Salami","Pulled Pork","Brisket"};
    String[] vegTypes= {"Button Mushroom","Tomatoes","Capsicum"};
    String[] cheeseTypes= {"Provolone","Cheddar","Blue Cheese"};

    @Override
    void cutBun() {
        System.out.println("Preparing Italian Hoagie");
        System.out.println("The Bun has been cut.");
    }

    @Override
    void addMeat() {
        System.out.print("Meat : ");
        for(String meat : meatTypes)
            System.out.print(meat + " added ");
        System.out.println();
    }

    @Override
    void addCheese() {
        System.out.print("Cheese : ");
        for(String cheese : cheeseTypes)
            System.out.print(cheese + " added ");
        System.out.println();
    }

    @Override
    void addVeggies() {
        System.out.print("Veggies : ");
        for(String veg : vegTypes)
            System.out.print(veg + " added ");
        System.out.println();
    }

    @Override
    void wrapHoagie() {
        System.out.println("Italian Hoagie wrapped and is ready to be served!! Enjoy.");
    }
}
