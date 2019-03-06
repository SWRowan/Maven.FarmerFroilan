package com.zipcodewilmington.froilansfarm.farm.foods;

import com.zipcodewilmington.froilansfarm.farm.interfaces.Edible;

public abstract class Food implements Edible {

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
