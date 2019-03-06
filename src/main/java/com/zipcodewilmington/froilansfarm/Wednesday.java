package com.zipcodewilmington.froilansfarm;

public class Wednesday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Wednesday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
