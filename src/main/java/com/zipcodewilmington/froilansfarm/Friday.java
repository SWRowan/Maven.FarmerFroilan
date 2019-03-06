package com.zipcodewilmington.froilansfarm;

public class Friday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Friday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
