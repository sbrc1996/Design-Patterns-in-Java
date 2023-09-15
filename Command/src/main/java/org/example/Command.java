package org.example;

public interface Command {
    public void execute();
    public void undo();     //to implement the Undo/Redo Functionality..
}
