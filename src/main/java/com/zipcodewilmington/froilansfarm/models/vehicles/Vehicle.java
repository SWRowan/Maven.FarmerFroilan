package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    private boolean isMounted;

    public Vehicle() {
        isMounted = false;
    }

    public void mount() {
        isMounted = true;
    }

    public void dismount() {
        isMounted = false;
    }

    public boolean isMounted() {
        return isMounted;
    }

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
