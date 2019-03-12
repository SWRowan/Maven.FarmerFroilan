package com.zipcodewilmington.froilansfarm.containers.farm;

import com.zipcodewilmington.froilansfarm.models.animals.*;
import com.zipcodewilmington.froilansfarm.containers.*;
import com.zipcodewilmington.froilansfarm.models.crops.*;
import com.zipcodewilmington.froilansfarm.models.foods.*;
import com.zipcodewilmington.froilansfarm.models.persons.*;
import com.zipcodewilmington.froilansfarm.models.vehicles.*;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DefaultFarmGenerator {
// TODO - Eliminate code smells
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
        return new ArrayList<>(Arrays.asList(
                new Stable(generateDefaultHorses(4)),
                new Stable(generateDefaultHorses(3)),
                new Stable(generateDefaultHorses(3))));
    }

    private static ArrayList<Horse> generateDefaultHorses(Integer numOfHorses) {
        return new ArrayList<>(Horse.horseList(numOfHorses));
    }

    public static ArrayList<ChickenCoop> generateDefaultChickenCoops() {
        return new ArrayList<>(Arrays.asList(
                new ChickenCoop(generateDefaultChickens(4)),
                new ChickenCoop(generateDefaultChickens(4)),
                new ChickenCoop(generateDefaultChickens(4)),
                new ChickenCoop(generateDefaultChickens(3))));
    }

    private static ArrayList<Chicken> generateDefaultChickens(Integer numOfChickens) {
        return new ArrayList<>(Chicken.chickenList(numOfChickens));
    }

    public static Field generateDefaultField() {
        return new Field(generateDefaultCropRows());
    }

    private static ArrayList<CropRow> generateDefaultCropRows() {
        return new ArrayList<>(Arrays.asList(
                new CropRow(generateDefaultCornCrops(0)),
                new CropRow(generateDefaultTomatoCrops(0)),
                new CropRow(generateDefaultPumpkinCrops(0)),
                new CropRow(generateDefaultCornCrops(0)),
                new CropRow(generateDefaultCornCrops(0))));
    }

    private static ArrayList<Crop> generateDefaultTomatoCrops(Integer numOfCrops) {
        return new ArrayList<>(TomatoPlant.tomatoPlantList(numOfCrops));
    }

    private static ArrayList<Crop> generateDefaultPumpkinCrops(Integer numOfPlants) {
        return new ArrayList<>(PumpkinPlant.pumpkinPlantList(numOfPlants));
    }

    private static ArrayList<Crop> generateDefaultCornCrops(Integer plantNumber) {
        return new ArrayList<>(CornStalk.cornStalkList(plantNumber));
    }
}