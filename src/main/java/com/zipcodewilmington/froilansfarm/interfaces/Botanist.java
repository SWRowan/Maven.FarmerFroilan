package com.zipcodewilmington.froilansfarm.interfaces;


import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.containers.CropRow;

public interface Botanist {
    void plant(Crop crop, CropRow cropRow);
}
