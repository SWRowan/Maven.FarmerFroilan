package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.Field;
import com.zipcodewilmington.froilansfarm.containers.farm.DefaultFarmGenerator;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.models.crops.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.models.crops.TomatoPlant;

import java.util.ArrayList;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class Sunday extends WorkDay {


    public void runSimulation(Farm farm) {
        println("\n\n***** Sunday Morning! *****\n");
        morningRoutine(farm);
        getIOConsole().println("\n*****  Time To Plant!  *****\n");
        plantDay(farm);
        afterWork(farm);
        userPressEnterToContinue();
    }

    protected static void plantDay(Farm farm) {
        plantTomatos(farm);
        plantPumpkin(farm);
        plantCorn(farm);
    }


    private static void plantCorn(Farm farm) {
        Integer counter = 3;
        for (int i = 2; i < farm.getField().getCropRows().size(); i++) {
            farm.getField().getCropRows().get(i).plantCrop(CornStalk.listToCropList(CornStalk.cornStalkList(100)));
            getIOConsole().println("--- " + farm.getFarmHouse().getPersonByName("Froilan").getName() + " planted 100 CornStalks in Row " + counter + " ---");
            counter++;
        }
    }

    private static void plantTomatos(Farm farm) {
        farm.getField().getCropRows().get(0).plantCrop(TomatoPlant.listToCropList(TomatoPlant.tomatoPlantList(100)));
        getIOConsole().println("--- " + farm.getFarmHouse().getPersonByName("Froilan").getName() + " planted 100 Tomato Plants in Row 1 ---");
    }

    private static void plantPumpkin(Farm farm) {
        farm.getField().getCropRows().get(1).plantCrop(PumpkinPlant.listToCropList(PumpkinPlant.pumpkinPlantList(100)));
        getIOConsole().println("--- " + farm.getFarmHouse().getPersonByName("Froilan").getName() + " planted 100 Pumpkin Plants in Row 2 ---");
    }

}
