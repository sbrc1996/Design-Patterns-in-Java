package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy Pattern!");

        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("geeksforgeeks.com");
            internet.connectTo("abc.com");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}