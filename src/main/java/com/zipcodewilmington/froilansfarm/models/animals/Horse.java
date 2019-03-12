package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

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

            getIOConsole().println(rider.getName() + " has ridden " + getName());
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
        return "Neigh!!";
    }

    public void eat(Meal meal) {
        getIOConsole().println(getName() + " ate " + meal.getNumOfFood() + " " + meal.getFood().getClass().getSimpleName() + "\n");
    }

    public static void RideAndFeed(Farm farm, Stable s) {
        Meal horseFeed;
        for (Horse h : s.getStable()) {
            horseFeed = farm.getStoreHouse().getFood(new EarCorn(), 3);
            h.mount();
            h.ride(farm.getFarmHouse().getRider());
            getIOConsole().println(h.makeNoise());
            h.eat(horseFeed);

        }
    }

}
