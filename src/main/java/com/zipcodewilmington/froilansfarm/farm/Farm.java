package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.containers.*;
import com.zipcodewilmington.froilansfarm.farm.utilities.*;
import com.zipcodewilmington.froilansfarm.farm.workdays.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Farm {
    public IOConsole ioConsole;
    private FarmHouse farmHouse;
    private Field field;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private StoreHouse storeHouse;
    private Garage garage;
    private int daysElapsed;

    public Farm() {
        this(System.in, System.out);
    }

    /**
     * For testing purposes
     */
    public Farm(InputStream in, PrintStream out) {
        ioConsole = new IOConsole(in, out);
        farmHouse = DefaultFarmGenerator.generateDefaultFarmHouse();
        field = DefaultFarmGenerator.generateDefaultField();
        chickenCoops = DefaultFarmGenerator.generateDefaultChickenCoops();
        stables = DefaultFarmGenerator.generateDefaultStables();
        garage = DefaultFarmGenerator.generateDefaultGarage();
        storeHouse = DefaultFarmGenerator.generateDefaultStoreHouse();
        daysElapsed = 0;
    }

    public void run() {
        boolean continueFarming = ioConsole.yesOrNoQuestion("Would you like to begin farming?");
        runFarm(continueFarming);
        ioConsole.println("Thanks for visiting the farm today!");
    }

    private void runFarm(boolean continueFarming) {
        while (continueFarming) {
            runWorkDay();
            displayStateOfFarm(ioConsole.yesOrNoQuestion("Would you like to display the current state of the farm?"));
            continueFarming = ioConsole.yesOrNoQuestion("%s days have elapsed. Would you like to keep farming?", daysElapsed);
        }
    }

    private void displayStateOfFarm(boolean choseYes) {
        if (choseYes) {
            ioConsole.println(this.toString());
        }
    }

    private void runWorkDay() {
        getCurrentWorkDay().run(this);
        daysElapsed++;
    }

    private WorkDay getCurrentWorkDay() {
        WorkDay workDay = null;
        switch (daysElapsed % 7) {
            case 0:
                workDay = new Sunday();
                break;
            case 1:
                workDay = new Monday();
                break;
            case 2:
                workDay = new Tuesday();
                break;
            case 3:
                workDay = new Wednesday();
                break;
            case 4:
                workDay = new Thursday();
                break;
            case 5:
                workDay = new Friday();
                break;
            case 6:
                workDay = new Saturday();
        }
        return workDay;
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
                '}';
    }

//        private static <T, E extends T> ArrayList<T> generateArrayList(T thing, E thing2, int numberOfThings) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//        Class<?> tClass = Class.forName(thing.getClass().toString());
//        Class<?> eClass = Class.forName(thing2.getClass().toString());
//
//        ArrayList<T> arrList = (ArrayList<T>) tClass.newInstance();
//
//        for (int i = 0; i < numberOfThings; i++) {
//            arrList.add((E) eClass.newInstance());
//        }
//
//        return arrList;
//    }
}
