package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {
    public void operate(Farm farm) {

    }

    public void makeNoise() {

    }

    public void mount() {

    }

    public void dismount() {

    }

    public ArrayList<Crop> harvest(CropRow cropRow) {
        return cropRow.harvestCrops();
    }
}
