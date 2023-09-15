package org.example;

public abstract class Hoagie {
    public boolean wantMeat;
    public boolean wantCheese;
    public boolean wantVeggies;
    final void makeSandwich(){          //this is the fixed algorithm. We don't want the child class to make any changes here.
        cutBun();
        if(wantCheese)
            addMeat();
        if(wantCheese)
            addCheese();
        if(wantVeggies)
            addVeggies();
        wrapHoagie();
    }
    abstract void cutBun();
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeggies();
    abstract void wrapHoagie();
}
