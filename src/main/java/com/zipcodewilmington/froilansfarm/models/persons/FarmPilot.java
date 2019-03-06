package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

public class FarmPilot extends Person implements Pilot {
    private Farm myFarm;

    public FarmPilot(String name, Farm myFarm) {
        super(name);
        this.myFarm = myFarm;
    }

    public void eat(Edible edible) {

    }

    public void makeNoise() {

    }

    public void fly(Aircraft aircraft) {

    }

    public Farm getMyFarm() {
        return myFarm;
    }

    public void setMyFarm(Farm myFarm) {
        this.myFarm = myFarm;
    }
}
