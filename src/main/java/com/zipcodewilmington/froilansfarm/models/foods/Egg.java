package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Egg extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public Egg() {

        energy = 5;
    }
    public void consumed() {


    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static ArrayList<Egg> eggList(Integer numOfEggs){
        return (ArrayList<Egg>) Stream.generate(Egg::new)
                .limit(numOfEggs)
                .collect(Collectors.toList());
    }

    public static ArrayList<Food> listToFoodList(ArrayList<Egg> egglist){
        ArrayList<Food> newList = new ArrayList<>();
        for (Egg e : egglist){
            newList.add(e);
        }
        return newList;
    }
}
