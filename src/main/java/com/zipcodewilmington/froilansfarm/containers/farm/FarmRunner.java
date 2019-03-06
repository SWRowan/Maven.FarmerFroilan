package com.zipcodewilmington.froilansfarm.containers.farm;

import com.zipcodewilmington.froilansfarm.simulations.*;

public class FarmRunner {
    private final Farm farm;

    public FarmRunner(Farm farm) {
        this.farm = farm;
    }

    void runFarm(boolean continueFarming) {
        while (continueFarming) {
            runWorkDay();
            displayStateOfFarm(farm.ioConsole.yesOrNoQuestion("Would you like to display the current state of the farm?"));
            continueFarming = farm.ioConsole.yesOrNoQuestion("%s days have elapsed. Would you like to keep farming?", farm.getDaysElapsed());
        }
    }

    void displayStateOfFarm(boolean choseYes) {
        if (choseYes) {
            farm.ioConsole.println(farm.toString());
        }
    }

    void runWorkDay() {
        getCurrentWorkDay().runSimulation(farm);
        farm.incrementDaysElapsed();
    }

    WorkDay getCurrentWorkDay() {
        WorkDay workDay = null;
        switch (farm.getDaysElapsed() % 7) {
            case 0:
                workDay = new Sunday();
                break;
            case 1:
                workDay = new Monday();
                break;
            case 2:
                workDay = new Tuesday();
                break;
            case 3:
                workDay = new Wednesday();
                break;
            case 4:
                workDay = new Thursday();
                break;
            case 5:
                workDay = new Friday();
                break;
            case 6:
                workDay = new Saturday();
        }
        return workDay;
    }
}