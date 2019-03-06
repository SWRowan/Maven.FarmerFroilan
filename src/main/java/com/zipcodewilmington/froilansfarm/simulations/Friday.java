package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

public class Friday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Friday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
