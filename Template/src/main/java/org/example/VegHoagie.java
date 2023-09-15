package org.example;

public class VegHoagie extends Hoagie{
    public VegHoagie() {
        this.wantCheese = false;
        this.wantMeat = false;
        this.wantVeggies = true;
    }
    String[] vegTypes= {"Button Mushroom","Tomatoes","Capsicum","Baby Corn","Potatoes"};
    @Override
    void cutBun() {
        System.out.println("Preparing Veg Hoagie");
        System.out.println("The Bun has been cut.");
    }

    @Override
    void addMeat() {
        System.out.println("He he");
    }

    @Override
    void addCheese() {}

    @Override
    void addVeggies() {
        System.out.print("Veggies : ");
        for(String veg : vegTypes)
            System.out.print(veg + " added ");
        System.out.println();
    }

    @Override
    void wrapHoagie() {
        System.out.println("Veg Hoagie wrapped and is ready to be served!! Enjoy.");
    }
}
