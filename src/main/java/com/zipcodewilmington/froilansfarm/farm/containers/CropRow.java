package com.zipcodewilmington.froilansfarm.farm.containers;

import com.zipcodewilmington.froilansfarm.farm.models.crops.Crop;

import java.util.ArrayList;

public class CropRow<T extends Crop> {
    private ArrayList<T> crops;

    public CropRow(ArrayList<T> crops) {
        this.crops = crops;
    }

    public void fertilizeCrops() {
        for (Crop crop : crops) {
            crop.fertilize();
        }
    }

    public ArrayList<T> harvestCrops() {
        for (Crop crop : crops) {
            crop.harvest();
        }
        ArrayList<T> harvestedCrops = crops;
        crops = new ArrayList<T>();
        return harvestedCrops;
    }

    public void plantCrop(T crop) {
        crops.add(crop);
    }

    public ArrayList<T> getCrops() {
        return crops;
    }

    @Override
    public String toString() {
        return "\nCropRow{" +
                "crops=" + crops +
                '}';
    }
}
