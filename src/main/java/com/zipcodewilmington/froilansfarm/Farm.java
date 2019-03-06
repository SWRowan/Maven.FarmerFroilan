package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    private FarmHouse farmHouse;
    private Field field;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private StoreHouse storeHouse;
    private Garage garage;

    public Farm() {
        farmHouse = DefaultFarmGenerator.generateDefaultFarmHouse();
        field = DefaultFarmGenerator.generateDefaultField();
        chickenCoops = DefaultFarmGenerator.generateDefaultChickenCoops();
        stables = DefaultFarmGenerator.generateDefaultStables();
        garage = DefaultFarmGenerator.generateDefaultGarage();
        storeHouse = DefaultFarmGenerator.generateDefaultStoreHouse();
    }

    public static void run() {

    }

//    private static <T, E extends T> ArrayList<T> generateArrayList(T thing, E thing2, int numberOfThings) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
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
