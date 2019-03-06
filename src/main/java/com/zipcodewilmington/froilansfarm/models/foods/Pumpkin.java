package com.zipcodewilmington.froilansfarm.models.foods;

public class Pumpkin extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public Pumpkin() {

        energy = 15;
    }

    public void eat() {

    }
}
