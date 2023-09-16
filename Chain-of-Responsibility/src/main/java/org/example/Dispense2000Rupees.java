package org.example;
/* We need to create different processor classes that will implement the DispenseChain interface and
provide implementation of dispense methods.
Since we are developing our system to work with three types of currency bills - Rs500, Rs2000 and Rs100,
we will create three concrete implementations.*/
public class Dispense2000Rupees implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount() >= 2000){
            int numberOfNotes = curr.getAmount()/2000;
            int remainder = curr.getAmount() % 2000;
            System.out.println("Dispensing : " + numberOfNotes + " Rs2000 notes.");
            if(remainder != 0)
                this.chain.dispense(new Currency(remainder));
        }
        else
            this.chain.dispense(curr);
    }
}
/*

The important point to note here is the implementation of dispense method.
You will notice that every implementation is trying to process the request and based on the amount,
it might process some or full part of it. If one of the chain not able to process it fully,
it sends the request to the next processor in chain to process the remaining request.
If the processor is not able to process anything, it just forwards the same request to the next chain.
 */