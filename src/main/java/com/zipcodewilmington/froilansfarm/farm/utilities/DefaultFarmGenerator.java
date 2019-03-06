package com.zipcodewilmington.froilansfarm.farm.utilities;

import com.zipcodewilmington.froilansfarm.farm.models.animals.*;
import com.zipcodewilmington.froilansfarm.farm.containers.*;
import com.zipcodewilmington.froilansfarm.farm.models.crops.*;
import com.zipcodewilmington.froilansfarm.farm.models.foods.*;
import com.zipcodewilmington.froilansfarm.farm.models.persons.*;
import com.zipcodewilmington.froilansfarm.farm.models.vehicles.*;

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
        return new StoreHouse(generateDefaultFoods());
    }

    private static ArrayList<Food> generateDefaultFoods() {
        ArrayList<Food> foods = new ArrayList<>();
        foods.addAll(generateDefaultEarCorns());
        foods.addAll(generateDefaultEggs());
        foods.addAll(generateDefaultPumpkins());
        foods.addAll(generateDefaultTomatoes());
        return foods;
    }

    private static ArrayList<EarCorn> generateDefaultEarCorns() {
        ArrayList<EarCorn> earCorns = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            earCorns.add(new EarCorn());
        }
        return earCorns;
    }

    private static ArrayList<Egg> generateDefaultEggs() {
        ArrayList<Egg> eggs = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            eggs.add(new Egg());
        }
        return eggs;
    }

    private static ArrayList<Pumpkin> generateDefaultPumpkins() {
        ArrayList<Pumpkin> pumpkins = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            pumpkins.add(new Pumpkin());
        }
        return pumpkins;
    }

    private static ArrayList<Tomato> generateDefaultTomatoes() {
        ArrayList<Tomato> tomatoes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            tomatoes.add(new Tomato());
        }
        return tomatoes;
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
        return new ArrayList<>(Arrays.asList(new CropRow<>(generateDefaultCornCrops()), new CropRow<>(generateDefaultTomatoCrops()),
                new CropRow<>(generateDefaultPumpkinCrops()), new CropRow<>(generateDefaultCornCrops()), new CropRow<>(generateDefaultCornCrops())));
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