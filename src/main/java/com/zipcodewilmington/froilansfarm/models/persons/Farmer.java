package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.models.vehicles.Vehicle;

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
        setLevelOfEnergy( edible.eat() );
    }

    public void makeNoise() {
        myFarm.ioConsole.println("Bla bla bla");
    }

    public void mount(Rideable rideable) {
        rideable.mount();
    }

    public void dismount(Rideable rideable) {
        rideable.dismount();

    }

    public Farm getMyFarm() {
        return myFarm;
    }

    public void setMyFarm(Farm myFarm) {
        this.myFarm = myFarm;
    }
}
