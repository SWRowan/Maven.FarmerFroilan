package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class Horse extends Animal implements Rideable {
    //private IOConsole console = new IOConsole();

    private String name;


    public Horse() {
        name = "";

    }

    public Horse(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {

        //console.println("Neigh");

    }

    public void eat(Food food, StoreHouse storeHouse) {
        if(storeHouse.checkStock(food) >=2) {
            //console.println(getName() + " ate 2 Ears of Corn.");
        }

    }

    public void mount() {

    }

    public void dismount() {

    }

    public void ride() {

    }
}
