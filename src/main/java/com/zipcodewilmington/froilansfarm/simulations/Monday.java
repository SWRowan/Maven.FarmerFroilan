package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Tractor;

import java.util.ArrayList;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Monday extends WorkDay {

    protected static void fertilizeDay(Farm farm){
        CropDuster duster = getCropDuster(farm);
        fertilizeCrops(farm, duster);
    }

    protected static CropDuster getCropDuster(Farm farm) {
        getIOConsole().println(farm.getFarmHouse().getPilot().getName()+" pulled the Crop Duster out of Garage.\n");
        return farm.getGarage().getCropDuster(farm);
    }

    protected static void fertilizeCrops(Farm farm, CropDuster duster) {
        getIOConsole().println(farm.getFarmHouse().getPilot().getName()+" fertilized all the Crops!\n");
        duster.operate(farm);
        getIOConsole().println(farm.getFarmHouse().getPilot().getName()+" landed the Crop Duster and stored it back in the Garage!\n");

    }
    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Monday Morning!  *****\n");
        morningRoutine(farm);
        getIOConsole().println("\n\n*****  Time To Fertilize!  *****\n");
        fertilizeDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}