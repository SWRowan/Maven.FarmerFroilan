package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.Tomato;

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
