package org.example;

import java.util.Stack;

//this is the INVOKER
public class RemoteControl {
    Command command;
    Stack<Command> acCommandHistory = new Stack<>();
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
        acCommandHistory.push(command);
    }

    public void undo(){
        if(!acCommandHistory.isEmpty()){
            Command lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }

}
