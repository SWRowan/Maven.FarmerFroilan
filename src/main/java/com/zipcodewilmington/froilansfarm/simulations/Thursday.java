package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;

public class Thursday extends WorkDay {
    public void runSimulation(Farm farm) {
        println("\n\n*****  Thursday Morning!  *****\n\n");
        morningRoutine(farm);
        println("\n*****  Time To fertilize the crops!  *****\n");
        thursdayWorkDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }

    private void thursdayWorkDay(Farm farm) {
        FarmPilot froilanda = (FarmPilot) farm.getFarmHouse().getPersonByName("Froilanda");
        CropDuster cropDuster = farm.getGarage().getCropDuster();
        fertilizeCropsUsingCropDuster(farm, froilanda, cropDuster);
        println("\n***** The Thursday workday is over! *****\n");
    }
}