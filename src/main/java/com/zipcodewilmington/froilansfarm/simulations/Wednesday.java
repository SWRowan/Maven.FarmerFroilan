package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Wednesday extends WorkDay {
    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Wednesday Morning!  *****\n\n");
        morningRoutine(farm);
        getIOConsole().println("\n\n*****  Lets Plant the Next Batch  *****\n\n");
        Sunday.plantDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}
