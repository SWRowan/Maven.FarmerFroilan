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

import java.util.ArrayList;
import java.util.HashMap;

public class MainApplication {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.run();
        Stable stable = new Stable(Horse.horseList(10));
        Farmer farmer = new Farmer("Bubba", farm);
        ChickenCoop chickenCoop = new ChickenCoop(Chicken.chickenList(10));
        Meal horseFeed;
        System.out.println(farmer.getName());

        for(Chicken c : chickenCoop.getChickens()){
            System.out.println(c.makeNoise());
        }

        ArrayList<Food> temp = new ArrayList<>(EarCorn.cornList(40));
        StoreHouse storeHouse = new StoreHouse(new HashMap<>());
        storeHouse.addFood(temp);


        for(Horse h : stable.getStable()){
            horseFeed = storeHouse.getFood(new EarCorn(), 3);
            h.mount();
            System.out.println(h.makeNoise());
            h.ride(farmer);
            h.eat(horseFeed);
        }

        System.out.println(storeHouse.getStoredFoods());


    }


}