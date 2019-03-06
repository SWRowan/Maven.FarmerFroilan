package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements NoiseMaker, Rideable {

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
