package com.zipcodewilmington.froilansfarm.farm.models.crops;

import com.zipcodewilmington.froilansfarm.farm.models.foods.EarCorn;

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
