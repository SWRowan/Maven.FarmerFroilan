package com.zipcodewilmington.froilansfarm;

public class PumpkinPlant extends Crop {
    public Pumpkin yield() {
        Pumpkin pumpkin;
        if (isFertilized() && isHarvested()) {
            pumpkin = new Pumpkin();
        } else {
            pumpkin = null;
        }
        return pumpkin;
    }
}
