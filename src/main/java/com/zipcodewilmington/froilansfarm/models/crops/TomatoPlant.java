package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.Tomato;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TomatoPlant extends Crop {
    public Tomato yield() {
        Tomato tomato;
        if (isFertilized() && isHarvested()) {
            tomato = new Tomato();
        } else {
            tomato = null;
        }
        return tomato;
    }

    public static ArrayList<TomatoPlant> tomatoPlantList(Integer numberOfPlants){
        return (ArrayList<TomatoPlant>) Stream.generate(TomatoPlant::new)
                .limit(numberOfPlants)
                .collect(Collectors.toList());
    }

    public static ArrayList<Crop> listToCropList(ArrayList<TomatoPlant> list){
        ArrayList<Crop> newList = new ArrayList<>();
        for(TomatoPlant c : list){
            newList.add(c);
        }
        return newList;
    }

}
