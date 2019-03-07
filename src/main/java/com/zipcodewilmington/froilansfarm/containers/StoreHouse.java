package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoreHouse {
   // private IOConsole console = new IOConsole();
    private HashMap<Food, Integer> storedFoods;

    public StoreHouse(HashMap<Food, Integer> storedFoods) {
        this.storedFoods = storedFoods;
    }

    public String getStoredFoods() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry me : storedFoods.entrySet()) {
            sb.append(me.getKey() + " : " + me.getValue() + "\n");
        }
        return sb.toString();
    }

    public void removeFood(Food food, Integer removedFood) {
        if(storedFoods.get(food) >= removedFood) {
            storedFoods.replace(food, storedFoods.get(food) - removedFood);
        }else{
            //console.print("*** NOT ENOUGH ***" + food+ "'s\n");
        }
    }

    public void addFood(Food food, Integer addedFood) {
        storedFoods.replace(food, storedFoods.get(food) + addedFood);
    }

    public Integer checkStock(Food food){
        return storedFoods.get(food);
    }


//    @Override
//    public String toString() {
//        return "\nStoreHouse{" +
//                "storedFoods=" + storedFoods +
//                '}';
//    }
}
