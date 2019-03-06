package com.zipcodewilmington.froilansfarm.farm.models.vehicles;

import com.zipcodewilmington.froilansfarm.farm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.farm.containers.Farm;
import com.zipcodewilmington.froilansfarm.farm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.farm.interfaces.FarmVehicle;

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
