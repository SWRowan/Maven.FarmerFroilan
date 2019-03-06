package com.zipcodewilmington.froilansfarm;

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
