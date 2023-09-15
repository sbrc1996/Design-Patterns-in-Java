package org.example;

import java.util.ArrayList;

//This is out client..
public class Waitress {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        //with no iterators..
        System.out.println("\n Menu (without Iterators) \n -- \n Breakfast");
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for(int i=0;i<breakfastItems.size();i++){
            String item = (String) breakfastItems.get(i);
            System.out.println(item);
        }

        System.out.println("\nLunch");
        String[] lunchMenu = dinerMenu.getMenuItems();
        for(int i=0;i< lunchMenu.length;i++){
            String menuItem = lunchMenu[i];
            System.out.println(menuItem);
        }

        /*Writing the entire business logic in the main class is very dangerous and a bad practice.. */


        //with iterators..
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\n Menu (with Iterators) \n -- \n Breakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
    }
    private static void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }
}
