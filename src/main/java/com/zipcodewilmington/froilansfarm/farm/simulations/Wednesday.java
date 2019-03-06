package com.zipcodewilmington.froilansfarm.farm.simulations;

import com.zipcodewilmington.froilansfarm.farm.containers.Farm;

public class Wednesday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Wednesday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
