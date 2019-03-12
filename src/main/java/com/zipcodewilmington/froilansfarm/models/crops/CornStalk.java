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
}
