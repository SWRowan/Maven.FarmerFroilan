package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.simulations.Friday;
import com.zipcodewilmington.froilansfarm.simulations.Tuesday;

public class MainApplication {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.run();

    }


}