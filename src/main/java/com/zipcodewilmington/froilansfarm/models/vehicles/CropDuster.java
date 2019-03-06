package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    public void fly() {

    }

    public void operate(Farm farm) {

    }

    public void makeNoise() {

    }

    public void mount() {

    }

    public void dismount() {

    }

    public void fertilize(CropRow cropRow) {
        cropRow.fertilizeCrops();
    }
}
