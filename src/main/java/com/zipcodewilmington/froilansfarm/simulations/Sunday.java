package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.models.crops.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.models.crops.TomatoPlant;


import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Sunday extends WorkDay {

    protected static void plantDay(Farm farm) {
        plantTomatos(farm);
        plantPumpkins(farm);
        plantCorn(farm);
    }

    private static void plantCorn(Farm farm) {
        Integer count = 3;
        for (int i = 2; i < farm.getField().getCropRows().size(); i++) {
            farm.getField().getCropRows().get(i).plantCrop(CornStalk.listToCropList(CornStalk.cornStalkList(100)));
            getIOConsole().println("--- "+farm.getFarmHouse().getFarmer().getName() + " planted 100 CornStalks in Row " + count + " ---\n");
            count++;
        }
    }

    private static void plantPumpkins(Farm farm) {
        farm.getField().getCropRows().get(1).plantCrop(PumpkinPlant.listToCropList(PumpkinPlant.pumpkinPlantList(100)));
        getIOConsole().println("--- "+farm.getFarmHouse().getFarmer().getName() + " planted 100 Pumpkin Plants in Row 2 ---\n");
    }

    private static void plantTomatos(Farm farm) {
        farm.getField().getCropRows().get(0).plantCrop(TomatoPlant.listToCropList(TomatoPlant.tomatoPlantList(100)));
        getIOConsole().println("--- "+farm.getFarmHouse().getFarmer().getName() + " planted 100 Tomato Plants in Row 1 ---\n");
    }

    public void runSimulation(Farm farm) {
        getIOConsole().println("\n\n*****  Sunday Morning!  *****\n");
        morningRoutine(farm);
        getIOConsole().println("\n\n*****  Time To Plant!  *****\n");
        plantDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }
}
