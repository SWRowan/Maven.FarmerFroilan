package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
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

    public Rider getFarmer() {
        for (Person p : getPersons()) {
            if (p instanceof Farmer) {
                return (Rider) p;

            }
            break;
        }
        return null;
    }

    public FarmPilot getPilot() {
        for (Person p : getPersons()) {
            if (p instanceof FarmPilot) {
                return (FarmPilot)p;
            }
        }
        return null;
    }
}

