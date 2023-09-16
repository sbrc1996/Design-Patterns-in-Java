package org.example;

public class Dispense100Rupees implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount() >= 100){
            int numberOfNotes = curr.getAmount()/100;
            int remainder = curr.getAmount() % 100;
            System.out.println("Dispensing : " + numberOfNotes + " Rs100 notes.");
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
