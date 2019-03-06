package com.zipcodewilmington.froilansfarm.farm.containers;

import com.zipcodewilmington.froilansfarm.farm.models.animals.Horse;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "\nStable{" +
                "horses=" + horses +
                '}';
    }
}
