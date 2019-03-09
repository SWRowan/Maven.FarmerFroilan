package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.PlateOfFood;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
    public void eat(PlateOfFood plateOfFood) {
        IOConsole.getIOConsole().println("Chicken: ate " + plateOfFood.getNumOfFood() + " " + plateOfFood.getFood().getClass().getSimpleName() + "\n");

    }
}
