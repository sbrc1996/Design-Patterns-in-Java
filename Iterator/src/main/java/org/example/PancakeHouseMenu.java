package org.example;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<String>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String item){
        menuItems.add(item);
    }

    public ArrayList<String> getMenuItems(){
        return menuItems;
    }
    @Override
    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }

    public String toString(){
        return "Pancake House Menu";
    }
}
