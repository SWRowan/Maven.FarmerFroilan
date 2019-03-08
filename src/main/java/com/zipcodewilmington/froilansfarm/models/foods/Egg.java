package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;

import java.util.ArrayList;

public class Egg extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public Egg() {

        energy = 5;
    }
    public void consumed(StoreHouse storeHouse) {
        storeHouse.removeFood(new Egg(), 1);

    }

    @Override
    public int hashCode() {
        return 0;
    }
}
