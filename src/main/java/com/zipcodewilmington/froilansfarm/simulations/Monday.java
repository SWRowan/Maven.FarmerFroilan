package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

public class Monday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Monday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
