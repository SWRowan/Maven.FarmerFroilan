package com.zipcodewilmington.froilansfarm.farm.containers;

import com.zipcodewilmington.froilansfarm.farm.crops.Crop;

import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> crops;

    public CropRow(ArrayList<Crop> crops) {
        this.crops = crops;
    }

    public void fertilizeCrops() {
        for (Crop crop : crops) {
            crop.fertilize();
        }
    }

    public ArrayList<Crop> harvestCrops() {
        for (Crop crop : crops) {
            crop.harvest();
        }
        ArrayList<Crop> harvestedCrops = crops;
        crops = new ArrayList<Crop>();
        return harvestedCrops;
    }

    public void plantCrop(Crop crop) {
        crops.add(crop);
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }

    @Override
    public String toString() {
        return "\nCropRow{" +
                "crops=" + crops +
                '}';
    }
}
