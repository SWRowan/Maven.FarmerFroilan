package com.zipcodewilmington.froilansfarm;

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
