package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;

public class Tomato extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public Tomato() {

        energy = 2;
    }

    public void consumed(StoreHouse storeHouse) {
        storeHouse.removeFood(new Tomato(),1);

    }
}
