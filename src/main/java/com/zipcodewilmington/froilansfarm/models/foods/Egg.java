package com.zipcodewilmington.froilansfarm.models.foods;

import java.util.ArrayList;

public class Egg extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public Egg() {

        energy = 5;
    }
    public void eat() {

    }
}
