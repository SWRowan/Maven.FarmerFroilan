package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
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


    public StoreHouse(HashMap<Food, Integer> storedFoods) {
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

    public void removeFood(Food food, Integer removedFood) {

        if (food instanceof EarCorn && storedFoods.get(earCorn) >= removedFood) {
            storedFoods.replace(earCorn, storedFoods.get(earCorn) - removedFood);
        } else if (food instanceof Tomato && storedFoods.get(tomato) >= removedFood) {
            storedFoods.replace(tomato, storedFoods.get(tomato) - removedFood);
        } else if (food instanceof Pumpkin && storedFoods.get(pumpkin) >= removedFood) {
            storedFoods.replace(pumpkin, storedFoods.get(pumpkin) - removedFood);
        } else if (food instanceof Egg && storedFoods.get(egg) >= removedFood) {
            storedFoods.replace(egg, storedFoods.get(egg) - removedFood);
        } else {
            console.print("*** NOT ENOUGH ***" + food + "'s\n");
        }
    }

    public void addFood(ArrayList<Food> harvestedFood) {

        for (Food food : harvestedFood) {
            if (food instanceof EarCorn) {
                storedFoods.replace(earCorn, storedFoods.get(earCorn) + 1);
            } else if (food instanceof Tomato) {
                storedFoods.replace(tomato, storedFoods.get(tomato) + 1);
            } else if (food instanceof Pumpkin) {
                storedFoods.replace(pumpkin, storedFoods.get(pumpkin) + 1);
            } else if (food instanceof Egg) {
                storedFoods.replace(egg, storedFoods.get(egg) + 1);
            }
        }

    }

    public Integer checkStock(Food food) {
        if (food instanceof EarCorn) {
            return storedFoods.get(earCorn);
        } else if (food instanceof Tomato) {
            return storedFoods.get(tomato);
        } else if (food instanceof Pumpkin) {
            return storedFoods.get(pumpkin);
        } else if (food instanceof Egg) {
            return storedFoods.get(egg);
        }

        return 0;
    }

}
