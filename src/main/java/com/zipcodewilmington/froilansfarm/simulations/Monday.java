package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;

public class Monday extends WorkDay {
    public void runSimulation(Farm farm) {
        println("\n\n*****  Monday Morning!  *****\n\n");
        morningRoutine(farm);
        println("\n*****  Time To fertilize the crops!  *****\n");
        mondayWorkDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }

    private void mondayWorkDay(Farm farm) {
        FarmPilot froilanda = (FarmPilot) farm.getFarmHouse().getPersonByName("Froilanda");
        CropDuster cropDuster = farm.getGarage().getCropDuster();
        fertilizeCropsUsingCropDuster(farm, froilanda, cropDuster);
        println("\n***** The Monday workday is over! *****\n");
    }
}