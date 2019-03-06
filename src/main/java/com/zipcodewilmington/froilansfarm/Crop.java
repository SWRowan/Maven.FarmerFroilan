package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce{
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
        return '\n' + this.getClass().getSimpleName() + "{ " +
                "hasBeenFertilized=" + hasBeenFertilized +
                ", hasBeenHarvested=" + hasBeenHarvested +
                "}";
    }
}