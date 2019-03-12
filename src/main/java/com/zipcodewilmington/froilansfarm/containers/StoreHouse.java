package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.foods.*;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoreHouse {
    private IOConsole console = IOConsole.getIOConsole();
    private HashMap<Food, Integer> storedFoods;
    private EarCorn earCorn = new EarCorn();
    private Tomato tomato = new Tomato();
    private Pumpkin pumpkin = new Pumpkin();
    private Egg egg = new Egg();

    public StoreHouse(){
        storedFoods = new HashMap<>();
        storedFoods.put(earCorn, 105);
        storedFoods.put(tomato, 15);
        storedFoods.put(pumpkin, 0);
        storedFoods.put(egg, 0);
    }

    public StoreHouse(HashMap<Food, Integer> storedFoods){
        this.storedFoods = storedFoods;
        storedFoods.put(earCorn, 0);
        storedFoods.put(tomato, 0);
        storedFoods.put(pumpkin, 0);
        storedFoods.put(egg, 0);
    }


    public String getStoredFoods() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry me : storedFoods.entrySet()) {
            sb.append(me.getKey() + " : " + me.getValue() + "\n");
        }
        return sb.toString();
    }

    public Meal getFood(Food food, Integer numOfFood) {

        if (storedFoods.get(typeOfFood(food)) >= numOfFood) {
            storedFoods.replace(typeOfFood(food), storedFoods.get(typeOfFood(food)) - numOfFood);
            Meal meal = new Meal(food, numOfFood);
            return meal;
        }else{
            console.print("*** NOT ENOUGH " + food + "'s ***\n");
            Meal meal = new Meal(food, 0);
            return meal;
        }
    }


    public void addFood(ArrayList<Food> harvestedFood) {
        for (Food food : harvestedFood) {
                storedFoods.replace(typeOfFood(food), storedFoods.get(typeOfFood(food)) + 1);
        }
    }

    public Food typeOfFood(Food food){
        if (food instanceof EarCorn) {
            return earCorn;
        } else if (food instanceof Tomato) {
            return tomato;
        } else if (food instanceof Pumpkin) {
            return pumpkin;
        } else if (food instanceof Egg) {
            return egg;
        } else{
            return null;
        }
    }
    

    public Integer checkStock(Food food) {
        return storedFoods.get(typeOfFood(food));
    }

}
