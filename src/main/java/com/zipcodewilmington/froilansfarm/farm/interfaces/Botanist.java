package com.zipcodewilmington.froilansfarm.farm.interfaces;


import com.zipcodewilmington.froilansfarm.farm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.containers.CropRow;

public interface Botanist {
    void plant(Crop crop, CropRow cropRow);
}
