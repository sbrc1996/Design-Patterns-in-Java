package org.example;

public class DinerMenu implements Menu{
    //Here this menu has been implemented using a Array.
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    String[] menuItems;

    public DinerMenu() {
        menuItems = new String[MAX_ITEMS];

        addItem("Vegetarian BLT");
        addItem("BLT");
        addItem("Soup of the day");
        addItem("Hotdog");
        addItem("Steamed Veggies and Brown Rice");
        addItem("Pasta");
    }

    public void addItem(String name){
        if(numberOfItems >= MAX_ITEMS)
            System.out.println("Sorry, the maximum capacity of the Menu has been reached.");
        else{
            menuItems[numberOfItems] = name;
            numberOfItems++;
        }
    }

    public String[] getMenuItems(){
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public String toString(){
        return "Diner Menu";
    }
}
