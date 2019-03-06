package com.zipcodewilmington.froilansfarm.farm.animals;

import com.zipcodewilmington.froilansfarm.farm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.farm.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
