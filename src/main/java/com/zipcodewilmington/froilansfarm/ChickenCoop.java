package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickens;

    public ChickenCoop(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "\nChickenCoop{" +
                "chickens=" + chickens +
                '}';
    }
}
