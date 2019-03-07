package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.foods.Food;

public class Horse extends Animal implements Rideable {
    //private IOConsole console = new IOConsole();
    private boolean isMounted;
    private String name;

    public Horse() {
        this("");
    }

    public Horse(String name){
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
        return null;
        //console.println("Neigh");

    }

    public void eat(Food food, StoreHouse storeHouse) {
        if(storeHouse.checkStock(food) >=2) {
            //console.println(getName() + " ate 2 Ears of Corn.");
        }

    }

    public void ride(Rider rider) {

    }
}
