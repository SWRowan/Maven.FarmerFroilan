package com.zipcodewilmington.froilansfarm.farm.models.animals;

import com.zipcodewilmington.froilansfarm.farm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.farm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.farm.interfaces.Produce;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public void makeNoise() {

    }

    public void eat(Edible edible) {

    }

    public Egg yield() {
        Egg egg;
        if (!hasBeenFertilized) {
            egg = new Egg();
        } else {
            egg = null;
        }
        return egg;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public boolean isFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public String toString() {
        return "\nChicken{" +
                "hasBeenFertilized=" + hasBeenFertilized +
                '}';
    }
}
