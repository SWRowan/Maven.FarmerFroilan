package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Horse extends Animal implements Rideable {
    //private IOConsole console = new IOConsole();
    private boolean isMounted;
    private String name;

    public Horse() {
        this("");
    }

    public Horse(String name) {
        this.name = name;
        isMounted = false;
    }

    public void mount() {
        isMounted = true;
    }

    public void dismount() {
        isMounted = false;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeNoise() {
        return "Neigh!!!";


    }

    public void eat(Food food, Integer numOfFood) {


            IOConsole.getIOConsole().println(getName() + " ate " + numOfFood+" "+ food.getClass().getSimpleName() + "\n");

    }

    public void ride(Rider rider) {

    }
}
