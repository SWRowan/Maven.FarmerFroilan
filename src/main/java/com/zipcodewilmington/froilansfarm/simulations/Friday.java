package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Friday extends WorkDay {
    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Friday Morning!  *****\n\n");
        morningRoutine(farm);
        getIOConsole().println("\n*****  Time To Harvest!  *****\n");
        Tuesday.tuesdayWorkDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}