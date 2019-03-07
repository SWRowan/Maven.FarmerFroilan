package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.models.foods.Food;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle<ArrayList<Food>> {

    public void ride(Rider rider) {

    }

    public ArrayList<Food> operate(Farm farm) {
        ArrayList<Food> harvestedFoods = new ArrayList<>();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            harvestedFoods.addAll(harvest(cropRow));
        }
        return harvestedFoods;
    }

    public String makeNoise() {
        return "tractor noises";
    }

    public ArrayList<Food> harvest(CropRow cropRow) {
        ArrayList<Food> harvestedFoods = new ArrayList<>();
        for (Crop crop : cropRow.harvestCrops()) {
            if (crop.isFertilized() && crop.isHarvested()) {
                harvestedFoods.add(crop.yield());
            }
        }
        return harvestedFoods;
    }
}
