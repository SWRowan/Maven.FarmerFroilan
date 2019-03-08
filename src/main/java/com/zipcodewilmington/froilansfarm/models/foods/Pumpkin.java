package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;

public class Pumpkin extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public Pumpkin() {

        energy = 15;
    }

    public void consumed(StoreHouse storeHouse, Food food) {
        storeHouse.removeFood(food, 1);

    }
}
