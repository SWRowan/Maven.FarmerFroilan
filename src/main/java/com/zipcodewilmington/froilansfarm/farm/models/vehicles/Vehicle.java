package com.zipcodewilmington.froilansfarm.farm.models.vehicles;

import com.zipcodewilmington.froilansfarm.farm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
