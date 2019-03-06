package com.zipcodewilmington.froilansfarm;

public class Monday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Monday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
