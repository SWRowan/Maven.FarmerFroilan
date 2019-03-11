package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.simulations.Friday;
import com.zipcodewilmington.froilansfarm.simulations.Tuesday;

public class MainApplication {
    public static void main(String[] args) {
        Farm farm = new Farm();
<<<<<<< HEAD
//        farm.run();
        Friday friday = new Friday();
        friday.runSimulation(farm);
=======
        farm.run();
>>>>>>> 1f1e0d8861641bc738ee5e27dc01d08bc1c70eca

    }


}