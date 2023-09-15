package org.example;

import java.util.Scanner;

public class SetACTemperature implements Command{
    AirConditioner ac;
    int temp;

    public SetACTemperature(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        int userInput = scanner.nextInt();
        System.out.println("The temperature has been set to : "+userInput);
        this.temp = userInput;

        ac.setTemperature(userInput);
    }

    @Override
    public void undo() {
        System.out.println("The temperature has been reset to 24 C");
        ac.unSetTemperature();
    }
}
