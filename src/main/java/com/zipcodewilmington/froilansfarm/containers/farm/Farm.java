package com.zipcodewilmington.froilansfarm.containers.farm;

import com.zipcodewilmington.froilansfarm.containers.*;
import com.zipcodewilmington.froilansfarm.utilities.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Farm {
    private final FarmRunner farmRunner = new FarmRunner(this);
    public IOConsole ioConsole;
    private FarmHouse farmHouse;
    private Field field;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private StoreHouse storeHouse;
    private Garage garage;
    private int daysElapsed;

    public Farm() {
        ioConsole = IOConsole.getIOConsole();
        farmHouse = DefaultFarmGenerator.generateDefaultFarmHouse();
        field = DefaultFarmGenerator.generateDefaultField();
        chickenCoops = DefaultFarmGenerator.generateDefaultChickenCoops();
        stables = DefaultFarmGenerator.generateDefaultStables();
        garage = DefaultFarmGenerator.generateDefaultGarage();
//        storeHouse = DefaultFarmGenerator.generateDefaultStoreHouse();
        daysElapsed = 0;
    }

    /**
     * For testing purposes.
     * @param newIOConsole
     */
    public Farm(IOConsole newIOConsole) {
        ioConsole = newIOConsole;
        farmHouse = DefaultFarmGenerator.generateDefaultFarmHouse();
        field = DefaultFarmGenerator.generateDefaultField();
        chickenCoops = DefaultFarmGenerator.generateDefaultChickenCoops();
        stables = DefaultFarmGenerator.generateDefaultStables();
        garage = DefaultFarmGenerator.generateDefaultGarage();
//        storeHouse = DefaultFarmGenerator.generateDefaultStoreHouse();
        daysElapsed = 0;
    }

    public void run() {
        boolean continueFarming = ioConsole.yesOrNoQuestion("Would you like to begin farming?");
        farmRunner.runFarm(continueFarming);
        ioConsole.println("Thanks for visiting the farm today!");
    }

    public void incrementDaysElapsed() {
        daysElapsed++;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public StoreHouse getStoreHouse() {
        return storeHouse;
    }

    public Garage getGarage() {
        return garage;
    }

    public int getDaysElapsed() {
        return daysElapsed;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "\nfarmHouse=" + farmHouse +
                ",\n\nfield=" + field +
                ",\n\nchickenCoops=" + chickenCoops +
                ",\n\nstables=" + stables +
                ",\n\nstoreHouse=" + storeHouse +
                ",\n\ngarage=" + garage +
                ",\n\ndaysElapsed=" + daysElapsed +
                "\n}";
    }
}
