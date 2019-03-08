package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle<ArrayList<Food>> {

    public void ride(Rider rider) {
        IOConsole.getIOConsole().println("The tractor has been ridden");
    }

    public String makeNoise() {
        return "*Tractor Noises*";
    }

    public ArrayList<Food> operate(Farm farm) {
        ArrayList<Food> harvestedFoods = new ArrayList<>();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            harvestedFoods.addAll(harvest(cropRow));
        }
        return harvestedFoods;
    }

    public ArrayList<Food> harvest(CropRow cropRow) {
        ArrayList<Food> harvestedFoods = new ArrayList<>();
        for (Crop crop : cropRow.harvestCrops()) {
            if (crop.isFertilized()) {
                harvestedFoods.add(crop.yield());
            }
        }
        return harvestedFoods;
    }

//    HASH MAP IMPLEMENTATION
//    public HashMap<Food, Integer> operate(Farm farm) {
//        HashMap<Food, Integer> harvestedFoods = new HashMap<>();
//        for (CropRow cropRow : farm.getField().getCropRows()) {
//            harvestCropRowAndAddToHarvestedFoods(harvestedFoods, cropRow);
//        }
//        return harvestedFoods;
//    }
//
//    private void harvestCropRowAndAddToHarvestedFoods(HashMap<Food, Integer> harvestedFoods, CropRow cropRow) {
//        HashMap<Food, Integer> cropHarvest = harvest(cropRow);
//        for (Food key : cropHarvest.keySet()) {
//            harvestedFoods.put(key, harvestedFoods.getOrDefault(key, 0) + cropHarvest.get(key));
//        }
//    }
//
//    public HashMap<Food, Integer> harvest(CropRow cropRow) {
//        HashMap<Food, Integer> harvestedFoods = new HashMap<>();
//        Food foodType;
//        for (Crop crop : cropRow.harvestCrops()) {
//            if (crop.isFertilized()) {
//                foodType = crop.yield();
//                harvestedFoods.put(foodType, harvestedFoods.getOrDefault(foodType, 0) + 1);
//            }
//        }
//        return harvestedFoods;
//    }
}
