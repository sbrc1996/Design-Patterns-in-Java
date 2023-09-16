package org.example;

import java.util.Scanner;
/*
This is a very important step and we should create the chain carefully,
otherwise a processor might not be getting any request at all.
For example, in our implementation if we keep the first processor chain as Dollar1000Dispenser
and then Dollar500Dispenser, then the request will never be forwarded to the second processor and the chain will become useless.

Here is our ATM Dispenser implementation to process the user requested amount
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Chain of Responsibility Pattern!");

        //here we will implement it by using the example of ATM from the link :
        // https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java

        // initialize the chain
        DispenseChain c1 = new Dispense2000Rupees();
        DispenseChain c2 = new Dispense500Rupees();
        DispenseChain c3 = new Dispense100Rupees();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);

        while(true){
            int amount = 0;
            System.out.println("Enter the amount to be withdraw : ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 100 != 0){
                System.out.println("Amount should be in multiple of 100.");
                return;
            }
            //process the request..
            c1.dispense(new Currency(amount));
        }
    }
}