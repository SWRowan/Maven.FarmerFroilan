package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

import static com.zipcodewilmington.froilansfarm.simulations.Monday.fertilizeDay;
import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Thursday extends WorkDay {
    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Thursday Morning!  *****\n");
        morningRoutine(farm);
        getIOConsole().println("\n\n*****  Time To Fertilize!  *****\n");
        fertilizeDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}