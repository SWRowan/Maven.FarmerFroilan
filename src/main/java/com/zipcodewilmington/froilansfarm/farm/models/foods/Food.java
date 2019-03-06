package com.zipcodewilmington.froilansfarm.farm.models.foods;

import com.zipcodewilmington.froilansfarm.farm.interfaces.Edible;

public abstract class Food implements Edible {

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
