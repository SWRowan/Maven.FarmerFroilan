package com.zipcodewilmington.froilansfarm.farm.containers;

import com.zipcodewilmington.froilansfarm.farm.foods.Food;

import java.util.ArrayList;

public class StoreHouse {
    private ArrayList<Food> storedFoods;

    public StoreHouse(ArrayList<Food> storedFoods) {
        this.storedFoods = storedFoods;
    }

    public ArrayList<Food> getStoredFoods() {
        return storedFoods;
    }

    public void setStoredFoods(ArrayList<Food> storedFoods) {
        this.storedFoods = storedFoods;
    }

    public void addFoods(ArrayList<Food> foods) {
        storedFoods.addAll(foods);
    }

    @Override
    public String toString() {
        return "\nStoreHouse{" +
                "storedFoods=" + storedFoods +
                '}';
    }
}
