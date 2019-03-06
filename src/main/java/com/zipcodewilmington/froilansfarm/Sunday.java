package com.zipcodewilmington.froilansfarm;

public class Sunday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Sunday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
