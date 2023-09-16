package org.example;
/*The base interface should have a method to define the next processor in the chain and the method that will process the request */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency curr);
}
