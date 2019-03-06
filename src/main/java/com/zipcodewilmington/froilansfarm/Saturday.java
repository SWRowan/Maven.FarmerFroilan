package com.zipcodewilmington.froilansfarm;

public class Saturday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Saturday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
