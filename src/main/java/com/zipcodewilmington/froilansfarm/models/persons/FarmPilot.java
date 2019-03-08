package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.PlateOfFood;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Vehicle;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class FarmPilot extends Person implements Pilot, Rider {
    private Farm myFarm;

    public FarmPilot(String name, Farm myFarm) {
        super(name);
        this.myFarm = myFarm;
    }

    public String makeNoise() {
        return "Ruuun";
    }

    public void fly(Aircraft aircraft) {
        aircraft.fly();
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

    @Override
    public void eat(PlateOfFood plateOfFood) {
        IOConsole.getIOConsole().println(getName() + " ate " + plateOfFood.getNumOfFood() + " " +plateOfFood.getFood().getClass().getSimpleName() + "\n");
    }
}
