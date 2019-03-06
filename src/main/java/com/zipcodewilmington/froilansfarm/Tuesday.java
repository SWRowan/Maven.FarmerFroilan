package com.zipcodewilmington.froilansfarm;

public class Tuesday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Tuesday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
