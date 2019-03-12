package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.crops.Crop;

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
        crops = new ArrayList<>();
        return harvestedCrops;
    }

    public void plantCrop(ArrayList<Crop> list) {
        for(Crop c : list) {
            crops.add(c);
        }
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
