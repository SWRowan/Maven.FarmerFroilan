package com.zipcodewilmington.froilansfarm.farm.models.crops;

import com.zipcodewilmington.froilansfarm.farm.models.foods.Tomato;

public class TomatoPlant extends Crop {
    public Tomato yield() {
        Tomato tomato;
        if (isFertilized() && isHarvested()) {
            tomato = new Tomato();
        } else {
            tomato = null;
        }
        return tomato;
    }
}
