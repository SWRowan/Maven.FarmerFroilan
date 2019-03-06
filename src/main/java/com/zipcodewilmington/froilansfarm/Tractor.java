package com.zipcodewilmington.froilansfarm;

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
