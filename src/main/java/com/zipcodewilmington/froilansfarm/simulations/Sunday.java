package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

public class Sunday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Sunday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
