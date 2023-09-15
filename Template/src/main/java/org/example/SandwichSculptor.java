package org.example;

public class SandwichSculptor {
    public static void main(String[] args) {
        System.out.println("Template Pattern!");

        Hoagie v = new VegHoagie();
        v.makeSandwich();

        Hoagie i = new ItalianHoagie();
        i.makeSandwich();
    }
}