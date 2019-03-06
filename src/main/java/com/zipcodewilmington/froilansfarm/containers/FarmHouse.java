package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.persons.Person;

import java.util.ArrayList;

public class FarmHouse {
    private ArrayList<Person> persons;

    public FarmHouse(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "\nFarmHouse{" +
                "persons=" + persons +
                '}';
    }
}
