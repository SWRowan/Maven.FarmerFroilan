package com.zipcodewilmington.froilansfarm.farm.models.crops;

import com.zipcodewilmington.froilansfarm.farm.models.foods.Pumpkin;

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
