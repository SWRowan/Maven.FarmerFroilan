package com.zipcodewilmington.froilansfarm.interfaces;


import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;

import java.util.ArrayList;

public interface Botanist {
    void plant(ArrayList<Crop> crop, CropRow cropRow);
}
