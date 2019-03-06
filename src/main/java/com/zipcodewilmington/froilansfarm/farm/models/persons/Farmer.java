package com.zipcodewilmington.froilansfarm.farm.models.persons;

import com.zipcodewilmington.froilansfarm.farm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.farm.containers.Farm;
import com.zipcodewilmington.froilansfarm.farm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.interfaces.*;

public class Farmer extends Person implements Eater, Rider, Botanist {
    private Farm myFarm;

    public Farmer(String name, Farm myFarm) {
        super(name);
        this.myFarm = myFarm;
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.plantCrop(crop);
    }

    public void eat(Edible edible) {

    }

    public void makeNoise() {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public Farm getMyFarm() {
        return myFarm;
    }

    public void setMyFarm(Farm myFarm) {
        this.myFarm = myFarm;
    }
}
