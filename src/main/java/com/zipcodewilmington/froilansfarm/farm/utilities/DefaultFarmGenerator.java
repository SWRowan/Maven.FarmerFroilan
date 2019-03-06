package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.animals.*;
import com.zipcodewilmington.froilansfarm.farm.containers.*;
import com.zipcodewilmington.froilansfarm.farm.crops.*;
import com.zipcodewilmington.froilansfarm.farm.persons.*;
import com.zipcodewilmington.froilansfarm.farm.vehicles.*;

import java.util.ArrayList;
import java.util.Arrays;

public class DefaultFarmGenerator {
    public static FarmHouse generateDefaultFarmHouse() {
        return new FarmHouse(generateDefaultFarmers());
    }

    private static ArrayList<Person> generateDefaultFarmers() {
        return new ArrayList<>(Arrays.asList(new Farmer("Froilan", null), new FarmPilot("Froilanda", null)));
    }

    public static StoreHouse generateDefaultStoreHouse() {
        return new StoreHouse();
    }

    public static Garage generateDefaultGarage() {
        ArrayList<Vehicle> vehicles = new ArrayList<>(Arrays.asList(new Tractor(), new CropDuster()));
        return new Garage(vehicles);
    }

    public static ArrayList<Stable> generateDefaultStables() {
        return new ArrayList<>(Arrays.asList(new Stable(generateDefaultHorses(4)), new Stable(generateDefaultHorses(4)), new Stable(generateDefaultHorses(3))));
    }

    private static ArrayList<Horse> generateDefaultHorses(int numOfHorses) {
        ArrayList<Horse> horses = new ArrayList<>();
        for (int i = 0; i < numOfHorses; i++) {
            horses.add(new Horse());
        }
        return horses;
    }

    public static ArrayList<ChickenCoop> generateDefaultChickenCoops() {
        return new ArrayList<>(Arrays.asList(new ChickenCoop(generateDefaultChickens()), new ChickenCoop(generateDefaultChickens()), new ChickenCoop(generateDefaultChickens())));
    }

    private static ArrayList<Chicken> generateDefaultChickens() {
        return new ArrayList<>(Arrays.asList(new Chicken(), new Chicken(), new Chicken(), new Chicken(), new Chicken()));
    }

    public static Field generateDefaultField() {
        return new Field(generateDefaultCropRows());
    }

    private static ArrayList<CropRow> generateDefaultCropRows() {
        return new ArrayList<>(Arrays.asList(new CropRow(generateDefaultCornCrops()), new CropRow(generateDefaultTomatoCrops()),
                new CropRow(generateDefaultPumpkinCrops()), new CropRow(generateDefaultCornCrops()), new CropRow(generateDefaultCornCrops())));
    }

    private static ArrayList<Crop> generateDefaultTomatoCrops() {
        return new ArrayList<>(Arrays.asList(new TomatoPlant(), new TomatoPlant(), new TomatoPlant()));
    }

    private static ArrayList<Crop> generateDefaultPumpkinCrops() {
        return new ArrayList<>(Arrays.asList(new PumpkinPlant(), new PumpkinPlant(), new PumpkinPlant()));
    }

    private static ArrayList<Crop> generateDefaultCornCrops() {
        return new ArrayList<>(Arrays.asList(new CornStalk(), new CornStalk(), new CornStalk(),
                new CornStalk(), new CornStalk(), new CornStalk(), new CornStalk(),
                new CornStalk(), new CornStalk(), new CornStalk(), new CornStalk()));
    }
}