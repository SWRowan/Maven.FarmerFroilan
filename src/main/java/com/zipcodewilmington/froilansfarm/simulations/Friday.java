package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;


import static com.zipcodewilmington.froilansfarm.simulations.Tuesday.harvestDay;
import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Friday extends WorkDay {
    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Friday Morning!  *****\n");
        morningRoutine(farm);
        getIOConsole().println("\n*****  Time To Harvest!  *****\n");
        harvestDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}