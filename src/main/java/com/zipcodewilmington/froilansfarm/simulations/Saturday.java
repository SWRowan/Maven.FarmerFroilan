package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

public class Saturday extends WorkDay {
    public void runSimulation(Farm farm) {
        farm.ioConsole.println("Saturday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
