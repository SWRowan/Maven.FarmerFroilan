package com.zipcodewilmington.froilansfarm.farm.simulations;

import com.zipcodewilmington.froilansfarm.farm.containers.Farm;

public class Sunday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Sunday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
