package com.zipcodewilmington.froilansfarm.models.foods;


import com.zipcodewilmington.froilansfarm.containers.StoreHouse;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EarCorn extends Food {

    public Integer getEnergy() {
        return energy;
    }

    private Integer energy;

    public EarCorn() {

        energy = 10;
    }

    public void consumed() {

    }

    public static ArrayList<EarCorn> cornList (Integer numOfCorn){
        return (ArrayList<EarCorn>) Stream.generate(EarCorn::new)
                .limit(numOfCorn)
                .collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
