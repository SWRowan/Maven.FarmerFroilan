package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.ChickenCoop;
import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmSimulation;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.animals.Chicken;
import com.zipcodewilmington.froilansfarm.models.animals.Horse;
import com.zipcodewilmington.froilansfarm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
import com.zipcodewilmington.froilansfarm.models.persons.Person;

import static com.zipcodewilmington.froilansfarm.containers.Meal.mealList;
import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public abstract class WorkDay implements FarmSimulation {
    private Rider farmer;
    private Rider pilot;

    protected void println(String val, Object... args) {
        getIOConsole().println(val, args);
    }

    protected void userPressEnterToContinue() {
        getIOConsole().userPressEnterToContinue();
    }

    protected void morningRoutine(Farm farm) {
        checkFoodStock(farm);
        morningChickenRoutine(farm);
        morningHorseRoutine(farm);
        getIOConsole().println("\n*****  Time for Breakfast!  *****\n");
        breakfast(farm);
    }

    protected void checkFoodStock(Farm farm) {
        getIOConsole().println("\n--- Current Food Stock ---");
        getIOConsole().println(farm.getStoreHouse().getStoredFoods());
    }

    protected void morningHorseRoutine(Farm farm) {
        Integer count = 1;
        getIOConsole().println("*****  Time to Ride and Feed the Horses!  *****\n");
        for (Stable s : farm.getStables()) {
            //Thread.sleep(1000);
            getIOConsole().println("\n*****  Stable: " + count + "  *****\n");
            count++;
            Horse.RideAndFeed(farm, s);
        }
    }

    protected void morningChickenRoutine(Farm farm) {
        Integer totalEggs = 0;
        Integer count = 1;
        getIOConsole().println("\n***** Chicken Duty  *****");
        for (ChickenCoop coop : farm.getChickenCoops()) {
            getIOConsole().println("\n*****  Coop: " + count + "  *****");
            Integer eggCount = collectEggs(farm, coop);
            totalEggs += eggCount;
            getIOConsole().println(getFarmerName(farm) + " collected " + eggCount + " Eggs from Coop: " + count + "\n\n");
            count++;
        }
        getIOConsole().println("Total number of Eggs collected: " + totalEggs + "\n\n\n");
        farm.getStoreHouse().addFood(Egg.listToFoodList(Egg.eggList(totalEggs)));

    }

    protected void breakfast(Farm farm) {

        for (Person person : farm.getFarmHouse().getPersons()) {
            if (person instanceof Farmer) {
                farmerMeal(farm, person);
            } else if (person instanceof FarmPilot) {
                pilotMeal(farm, person);
            }
        }
        checkFoodStock(farm);
    }

    protected String getFarmerName(Farm farm) {
        return farm.getFarmHouse().getFarmer().getName();
    }

    protected String getPilotName(Farm farm) {
        return farm.getFarmHouse().getPilot().getName();
    }

    protected Integer collectEggs(Farm farm, ChickenCoop coop) {
        Integer eggCount = 0;
        for (Chicken chicken : coop.getChickens()) {
            getIOConsole().println("\n" + getFarmerName(farm) + " has collected an Egg!");
            getIOConsole().println(chicken.makeNoise());
            eggCount++;
        }
        return eggCount;
    }

    protected final void farmerMeal(Farm farm, Person person) {
        for (Meal m : mealList(farm, 1, 2, 5)) {
            person.eat(m);
        }
    }

    protected final void pilotMeal(Farm farm, Person person) {
        for (Meal m : mealList(farm, 2, 1, 2)) {
            person.eat(m);
        }
    }

    protected void afterWork(Farm farm) {
        getIOConsole().println("\n\n*****  Time to Relax!  *****");
        getIOConsole().println("\n\n" + getFarmerName(farm) + " says: " + farm.getFarmHouse().getPersons().get(0).makeNoise());
        getIOConsole().println("\n*****  Breakfast for Dinner  *****\n");
        breakfast(farm);
        getIOConsole().println("\n\n********  Time for bed  ********\n 🛌 ZzZzZzZzZzZzZzZzZzZzZzZzZz 🛌");

    }


//
}
