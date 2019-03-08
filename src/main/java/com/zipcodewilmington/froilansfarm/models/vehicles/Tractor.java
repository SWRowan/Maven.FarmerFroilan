package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.HashMap;

public class Tractor extends Vehicle implements FarmVehicle<HashMap<String, Integer>> {

    public HashMap<String, Integer> operate(Farm farm) {
        HashMap<String, Integer> harvestedFoods = new HashMap<>();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            harvestCropRowAndAddToHarvestedFoods(harvestedFoods, cropRow);
        }
        return harvestedFoods;
    }

    private void harvestCropRowAndAddToHarvestedFoods(HashMap<String, Integer> harvestedFoods, CropRow cropRow) {
        HashMap<String, Integer> cropHarvest = harvest(cropRow);
        for (String key : cropHarvest.keySet()) {
            harvestedFoods.put(key, harvestedFoods.getOrDefault(key, 0) + cropHarvest.get(key));
        }
    }

    public void ride(Rider rider) {
        IOConsole.getIOConsole().println("The tractor has been ridden");
    }

    public String makeNoise() {
        return "*Tractor Noises*";
    }

    public HashMap<String, Integer> harvest(CropRow cropRow) {
        HashMap<String, Integer> harvestedFoods = new HashMap<>();
        String foodName;
        for (Crop crop : cropRow.harvestCrops()) {
            if (crop.isFertilized()) {
                foodName = crop.yield().toString();
                harvestedFoods.put(foodName, harvestedFoods.getOrDefault(foodName, 0) + 1);
            }
        }
        return harvestedFoods;
    }
}
