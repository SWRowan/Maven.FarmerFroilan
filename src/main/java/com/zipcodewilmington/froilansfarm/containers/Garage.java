package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.models.vehicles.Vehicle;

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

    public Tractor getTractor(Farm farm){
        for(Vehicle v : farm.getGarage().getVehicles()){
            if(v instanceof Tractor){
                return (Tractor)v;
            }
            break;
        }
        return null;
    }

    public CropDuster getCropDuster(){
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof CropDuster){
                return (CropDuster) vehicle;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "\nGarage{" +
                "vehicles=" + vehicles +
                '}';
    }
}
