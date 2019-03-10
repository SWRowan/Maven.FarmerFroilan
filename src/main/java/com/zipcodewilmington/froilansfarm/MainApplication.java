package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.animals.Chicken;
import com.zipcodewilmington.froilansfarm.models.animals.Horse;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
import com.zipcodewilmington.froilansfarm.simulations.Tuesday;

import java.util.ArrayList;
import java.util.HashMap;

public class MainApplication {
    public static void main(String[] args) {
        Farm farm = new Farm();
//        farm.run();
        Tuesday tuesday = new Tuesday();
        tuesday.runSimulation(farm);

    }


}