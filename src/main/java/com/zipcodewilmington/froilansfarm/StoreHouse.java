package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class StoreHouse {
    private ArrayList<Edible> storedEdibles;

    public StoreHouse() {
        this.storedEdibles = new ArrayList<>();
    }

    public ArrayList<Edible> getStoredEdibles() {
        return storedEdibles;
    }

    public void setStoredEdibles(ArrayList<Edible> storedEdibles) {
        this.storedEdibles = storedEdibles;
    }

    public void addEdibles(ArrayList<Edible> edibles) {
        storedEdibles.addAll(edibles);
    }

    @Override
    public String toString() {
        return "\nStoreHouse{" +
                "storedEdibles=" + storedEdibles +
                '}';
    }
}
