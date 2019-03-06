package com.zipcodewilmington.froilansfarm.farm.containers;

import com.zipcodewilmington.froilansfarm.farm.vehicles.Vehicle;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "\nGarage{" +
                "vehicles=" + vehicles +
                '}';
    }
}
