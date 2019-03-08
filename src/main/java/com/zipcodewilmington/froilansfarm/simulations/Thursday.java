package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Thursday extends WorkDay {
    public void runSimulation(Farm farm) {
        IOConsole.getIOConsole().println("Thursday has happened!");
        IOConsole.getIOConsole().getStringInput("Press ENTER to continue");
    }
}
