package com.zipcodewilmington.froilansfarm;

public abstract class Food implements Edible{
    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
