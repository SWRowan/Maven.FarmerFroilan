package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;

    public void makeNoise() {

    }

    public void eat(Edible edible){

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
