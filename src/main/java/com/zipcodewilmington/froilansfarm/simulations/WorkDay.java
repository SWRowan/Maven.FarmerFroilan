package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmSimulation;
import com.zipcodewilmington.froilansfarm.models.animals.Chicken;
import com.zipcodewilmington.froilansfarm.models.animals.Horse;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.foods.Tomato;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
import com.zipcodewilmington.froilansfarm.models.persons.Person;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;

public abstract class WorkDay implements FarmSimulation {

    protected void println(String val, Object... args) {
        IOConsole.getIOConsole().println(val, args);
    }

    protected void userPressEnterToContinue() {
        IOConsole.getIOConsole().userPressEnterToContinue();
    }

    protected void morningRoutine(Farm farm) {
        morningChickenRoutine(farm);
        morningHorseRoutine(farm);
        breakfast(farm);
    }

    protected void morningHorseRoutine(Farm farm) {
        Integer count = 1;
        IOConsole.getIOConsole().println("Time to Ride and Feed the Horses!!\n");
        for (Stable s : farm.getStables()) {
            IOConsole.getIOConsole().println("\nStable: " + count + "\n");
            count++;
            Horse.RideAndFeed(farm, s);
        }
    }

    protected void morningChickenRoutine(Farm farm) {
        Integer totalEggs = 0;
        Integer count = 1;
        for (ChickenCoop coop : farm.getChickenCoops()) {
            Integer eggCount = 0;
            IOConsole.getIOConsole().println("Coop: " + count + "\n");
            eggCount = collectEggs(farm, coop, eggCount);
            totalEggs += eggCount;
            IOConsole.getIOConsole().println(getFarmerName(farm) + " collected " + eggCount + " Eggs from Coop: " + count + "\n\n");
            count++;
        }
        IOConsole.getIOConsole().println("Total number of Eggs collected: " + totalEggs + "\n\n\n");
        farm.getStoreHouse().addFood(Egg.listToFoodList(Egg.eggList(totalEggs)));

    }

    protected void breakfast(Farm farm) {
        IOConsole.getIOConsole().println("\nTime for Breakfast!\n\n");
        for (Person person : farm.getFarmHouse().getPersons()) {
            if (person instanceof Farmer) {
                froilanMeal(farm, person);
            } else if (person instanceof FarmPilot) {
                froilandaMeal(farm, person);
            }
        }
    }


    private String getFarmerName(Farm farm) {
        return farm.getFarmHouse().getRider().getName();
    }

    private Integer collectEggs(Farm farm, ChickenCoop coop, Integer eggCount) {
        for (Chicken chicken : coop.getChickens()) {
            IOConsole.getIOConsole().println("\n"+getFarmerName(farm) + " has collected an Egg!");
            IOConsole.getIOConsole().println(chicken.makeNoise());
            eggCount++;
        }
        return eggCount;
    }

    protected final void froilanMeal(Farm farm, Person person) {
        for (Meal m : mealList(farm,1, 2, 5)) {
            person.eat(m);
        }
    }

    protected final void froilandaMeal(Farm farm,Person person) {
        for (Meal m : mealList(farm,2, 1, 2)) {
            person.eat(m);
        }
    }


    private Meal corn;
    private Meal tomato;
    private Meal egg;

    private ArrayList<Meal> mealList(Farm farm, Integer numOfCorn, Integer numOfTomato, Integer numOfEgg) {
        corn = farm.getStoreHouse().getFood(new EarCorn(),numOfCorn);
        tomato = farm.getStoreHouse().getFood(new Tomato(), numOfTomato);
        egg = farm.getStoreHouse().getFood(new Egg(), numOfEgg);
        ArrayList<Meal> mealList = new ArrayList<>();
        mealList.add(corn);
        mealList.add(tomato);
        mealList.add(egg);
        return mealList;
    }


}
