package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Tuesday extends WorkDay {

    protected static void tuesdayWorkDay(Farm farm) {
        storeFoodInStoreHouse(farm, harvestCrops(farm, getTractor(farm)));
        getIOConsole().println(farm.getStoreHouse().getStoredFoods());
    }

    protected static Tractor getTractor(Farm farm) {
        getIOConsole().println(farm.getFarmHouse().getRider().getName()+" drove the Tractor out of Garage.\n");
        return farm.getGarage().getTractor(farm);
    }

    protected static ArrayList<Food> harvestCrops(Farm farm, Tractor tractor) {
        getIOConsole().println(farm.getFarmHouse().getRider().getName()+" Harvested the Field of Crops.\n");
        ArrayList<Food> harvestedFood = tractor.operate(farm);
        getIOConsole().println("Total Harvested Food: "+harvestedFood.size()+"\n");
        return harvestedFood;
    }

    private static void storeFoodInStoreHouse(Farm farm, ArrayList<Food> harvestedFood) {
        farm.getStoreHouse().addFood(harvestedFood);
    }

    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Tuesday Morning!  *****\n\n");
        morningRoutine(farm);
        getIOConsole().println("\n*****  Time To Harvest!  *****\n");
        tuesdayWorkDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}
