package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;


    public Chicken() {
    }

    public static ArrayList<Chicken> chickenList(Integer numberOfChickens) {
        return (ArrayList<Chicken>) Stream.generate(Chicken::new)
                .limit(numberOfChickens)
                .collect(Collectors.toList());
    }

    public String makeNoise() {
        return "Buh-gawk!";
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

    @Override
    public void eat(Meal meal) {
        IOConsole.getIOConsole().println("Chicken: ate " + meal.getNumOfFood() + " " + meal.getFood().getClass().getSimpleName() + "\n");

    }


}
