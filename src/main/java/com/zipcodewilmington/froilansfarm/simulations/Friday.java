package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Friday extends WorkDay {
    public void runSimulation(Farm farm) {
        IOConsole.getIOConsole().println("Friday has happened!");
        IOConsole.getIOConsole().getStringInput("Press ENTER to continue");
    }
}
