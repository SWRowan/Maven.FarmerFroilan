package com.zipcodewilmington.froilansfarm.farm.simulations;

import com.zipcodewilmington.froilansfarm.farm.containers.Farm;

public class Friday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Friday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
