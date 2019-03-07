package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.vehicles.Vehicle;

public class Farmer extends Person implements Eater, Rider, Botanist {

    public void ride() {

    }

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

    public String makeNoise() {
        return "Bla bla bla";
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

    @Override
    public void eat(Food food, StoreHouse storeHouse) {

    }
}
