package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CornStalk extends Crop {
    public EarCorn yield() {
        EarCorn earCorn;
        if (isFertilized() && isHarvested()) {
            earCorn = new EarCorn();
        } else {
            earCorn = null;
        }
        return earCorn;
    }

    public static ArrayList<CornStalk> cornStalkList(Integer numberOfStalks){
        return (ArrayList<CornStalk>) Stream.generate(CornStalk::new)
                .limit(numberOfStalks)
                .collect(Collectors.toList());
    }

    public static ArrayList<Crop> listToCropList(ArrayList<CornStalk> cornStalkList){
        ArrayList<Crop> newList = new ArrayList<>();
        for (CornStalk cs : cornStalkList){
            newList.add(cs);
        }
        return newList;
    }
}
