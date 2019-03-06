package com.zipcodewilmington.froilansfarm;

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

    public void fertilize(CropRow cropRow){
        cropRow.fertilizeCrops();
    }
}
