package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.models.foods.Tomato;

import java.util.ArrayList;
import java.util.stream.Stream;

public abstract class Crop implements Produce {
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public boolean isFertilized() {
        return hasBeenFertilized;
    }

    public boolean isHarvested() {
        return hasBeenHarvested;
    }



    @Override
    public String toString() {
        String fertilized = "not fertilized";
        if (hasBeenFertilized) {
            fertilized = "fertilized";
        }
        String harvested = "not harvested";
        if (hasBeenHarvested) {
            harvested = "harvested";
        }
        return String.format("%s, %s", this.getClass().getSimpleName(), fertilized);
    }


}