package com.zipcodewilmington.froilansfarm.models.foods;


import com.zipcodewilmington.froilansfarm.containers.StoreHouse;

public class EarCorn extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public EarCorn() {

        energy = 10;
    }

    public void consumed() {

    }
}
