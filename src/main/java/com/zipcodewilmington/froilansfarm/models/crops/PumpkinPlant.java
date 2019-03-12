package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.Pumpkin;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PumpkinPlant extends Crop {
    public Pumpkin yield() {
        Pumpkin pumpkin;
        if (isFertilized() && isHarvested()) {
            pumpkin = new Pumpkin();
        } else {
            pumpkin = null;
        }
        return pumpkin;
    }

    public static ArrayList<PumpkinPlant> pumpkinPlantList(Integer numberOfPlants) {
        return (ArrayList<PumpkinPlant>) Stream.generate(PumpkinPlant::new)
                .limit(numberOfPlants)
                .collect(Collectors.toList());
    }

    public static ArrayList<Crop> listToCropList(ArrayList<PumpkinPlant> pumpkinPlantList){
        ArrayList<Crop> newList = new ArrayList<>();
        for (PumpkinPlant pp : pumpkinPlantList){
            newList.add(pp);
        }
        return newList;
    }

}
