package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Sunday extends WorkDay {
    public void runSimulation(Farm farm) {
        IOConsole.getIOConsole().println("Sunday has happened!");
        IOConsole.getIOConsole().getStringInput("Press ENTER to continue");
    }
}
