package com.zipcodewilmington.froilansfarm;

public abstract class Person implements NoiseMaker, Eater {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                '}';
    }
}
