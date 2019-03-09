package com.zipcodewilmington.froilansfarm.containers;


import com.zipcodewilmington.froilansfarm.models.animals.Chicken;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChickenCoop {
    private ArrayList<Chicken> chickens;

    public ChickenCoop(){
        chickens = new ArrayList<>();
    }

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
