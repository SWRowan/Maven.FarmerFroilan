package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

public class Tuesday extends WorkDay {
    public void runSimulation(Farm farm) {
        println("Tuesday Morning!\n\n");


        System.out.println(farm.getStoreHouse().getStoredFoods());
      morningRoutine(farm);

        System.out.println(farm.getStoreHouse().getStoredFoods());



        userPressEnterToContinue();
    }
}
