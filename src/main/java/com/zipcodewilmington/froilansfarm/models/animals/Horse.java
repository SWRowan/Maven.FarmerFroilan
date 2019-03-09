package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.PlateOfFood;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Horse extends Animal implements Rideable {

    private boolean isMounted;
    private String name;

    public Horse() {
        this("Horse");
    }

    private Horse(String name) {
        this.name = name;
        isMounted = false;
    }

    public static ArrayList<Horse> horseList(Integer numberOfHorses) {
        return (ArrayList<Horse>) Stream.generate(Horse::new)
                .limit(numberOfHorses)
                .collect(Collectors.toList());
    }

    public static Horse createHorse(String name) {
        return new Horse(name);
    }


    @Override
    public void ride(Rider rider) {
        if (isMounted) {

            IOConsole.getIOConsole().println(rider.getName() + " has ridden "+ getName());
            dismount();
        }
    }

    public void mount() {
        isMounted = true;
    }

    public void dismount() {
        isMounted = false;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeNoise() {
        return "Neigh!!!";
    }

    public void eat(PlateOfFood plateOfFood) {
        IOConsole.getIOConsole().println(getName() + " ate " + plateOfFood.getNumOfFood() + " " + plateOfFood.getFood().getClass().getSimpleName() + "\n");
    }

}
