package com.zipcodewilmington.froilansfarm;

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
