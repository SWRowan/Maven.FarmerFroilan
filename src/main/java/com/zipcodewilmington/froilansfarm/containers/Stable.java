package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.animals.Horse;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> stable;

    public Stable(ArrayList<Horse> horses) {
        this.stable = new ArrayList<>(horses);
    }

    public ArrayList<Horse> getStable(){
        return stable;
    }

    public String getHorses() {
        StringBuilder sb = new StringBuilder();
        for(Horse h : stable){
            sb.append(h.getName()+"\n");
        }
        return sb.toString();
    }

    public void addHorseToStable(Horse horse){
        stable.add(horse);
    }

//    public void setHorses(ArrayList<Horse> horses) {
//        this.horses = horses;
//    }

    @Override
    public String toString() {
        return "\nStable{" +
                "horses=" + stable +
                '}';
    }
}
