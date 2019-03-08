package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public class CropDuster extends Vehicle implements FarmVehicle<Void>, Aircraft {

    public void ride(Rider rider) {
        IOConsole.getIOConsole().println("The crop duster has been ridden");
    }

    public void fly() {
        IOConsole.getIOConsole().println("The crop duster has been flown");
    }

    public Void operate(Farm farm) {
        for (CropRow cropRow : farm.getField().getCropRows()) {
            fertilize(cropRow);
        }
        return null;
    }

    public String makeNoise() {
        return "Crop duster noises";
    }

    public void fertilize(CropRow cropRow) {
        cropRow.fertilizeCrops();
    }
}
