package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.foods.Tomato;

import java.util.ArrayList;

public class Meal {

    private Food food;
    private Integer numOfFood;

    public Meal(Food food, Integer numOfFood){
    this.food = food;
    this.numOfFood = numOfFood;
    }

    public static ArrayList<Meal> mealList(Farm farm, Integer numOfCorn, Integer numOfTomato, Integer numOfEgg) {
        Meal corn = farm.getStoreHouse().getFood(new EarCorn(),numOfCorn);
        Meal tomato = farm.getStoreHouse().getFood(new Tomato(), numOfTomato);
        Meal egg = farm.getStoreHouse().getFood(new Egg(), numOfEgg);
        ArrayList<Meal> mealList = new ArrayList<>();
        mealList.add(corn);
        mealList.add(tomato);
        mealList.add(egg);
        return mealList;
    }


    public Food getFood() {
        return food;
    }

    public Integer getNumOfFood() {
        return numOfFood;
    }





}
