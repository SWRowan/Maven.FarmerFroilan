package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.containers.PlateOfFood;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.models.foods.Food;

public interface Eater {
    void eat(PlateOfFood plateOfFood);
}
