package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

public interface FarmVehicle<T> {
    T operate(Farm farm);
}
