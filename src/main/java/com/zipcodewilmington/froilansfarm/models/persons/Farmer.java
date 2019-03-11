package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist, Rider {

    private Farm myFarm;

    public Farmer(String name, Farm myFarm) {
        super(name);
        this.myFarm = myFarm;
    }

    public void plant(ArrayList<Crop> crop, Farm farm, Integer row) {
       farm.getField().getCropRows().get(row).plantCrop(crop);
    }

    public String makeNoise() {
        return "Things are getting wEiRd";
    }

    public void mount(Rideable rideable) {
        rideable.mount();
    }

    public void dismount(Rideable rideable) {
        rideable.dismount();
    }

//    public String getName(){
//        return super.getName();
//    }

    public Farm getMyFarm() {
        return myFarm;
    }

    public void setMyFarm(Farm myFarm) {
        this.myFarm = myFarm;
    }

    @Override
    public void eat(Meal meal) {
        IOConsole.getIOConsole().println( getName() + " ate " + meal.getNumOfFood() + " " + meal.getFood().getClass().getSimpleName());
    }
}
