package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Wednesday extends WorkDay {
    public void runSimulation(Farm farm) {
        println("\n\n***** Sunday Morning! *****\n");
        morningRoutine(farm);
        getIOConsole().println("\n*****  Time To Plant!  *****\n");
        Sunday.plantDay(farm);
        userPressEnterToContinue();
    }
}
