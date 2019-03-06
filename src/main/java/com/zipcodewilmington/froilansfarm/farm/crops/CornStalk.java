package com.zipcodewilmington.froilansfarm.farm.crops;

import com.zipcodewilmington.froilansfarm.farm.foods.EarCorn;

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
}
