package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Monday extends WorkDay {
    public void runSimulation(Farm farm) {
        IOConsole.getIOConsole().println("Monday has happened!");
        IOConsole.getIOConsole().getStringInput("Press ENTER to continue");
    }
}
