package com.zipcodewilmington.froilansfarm.farm.persons;

import com.zipcodewilmington.froilansfarm.farm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.farm.interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                '}';
    }
}
