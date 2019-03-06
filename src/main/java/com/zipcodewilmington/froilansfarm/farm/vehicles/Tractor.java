package com.zipcodewilmington.froilansfarm.farm.vehicles;

import com.zipcodewilmington.froilansfarm.farm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.interfaces.FarmVehicle;

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

    public ArrayList<Crop> harvest(CropRow cropRow){
        return cropRow.harvestCrops();
    }
}
