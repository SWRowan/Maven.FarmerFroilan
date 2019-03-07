package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;
    private Integer levelOfEnergy;

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

    public Integer getLevelOfEnergy() {
        return levelOfEnergy;
    }

    public void setLevelOfEnergy(Integer levelOfEnergy) {
        this.levelOfEnergy = levelOfEnergy;
    }
}
