package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.models.foods.Food;

public interface Eater {
    void eat(Food food, StoreHouse storeHouse);
}
