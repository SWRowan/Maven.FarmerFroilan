package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Tuesday extends WorkDay {
    public void runSimulation(Farm farm) {
        IOConsole.getIOConsole().println("Tuesday has happened!");
        IOConsole.getIOConsole().getStringInput("Press ENTER to continue");
    }
}
