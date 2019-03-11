package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import org.junit.Test;

import static org.junit.Assert.*;

public class FridayTest {

    //@Test
    public void testSim(){
        Friday friday = new Friday();
        Farm farm = new Farm();
        friday.runSimulation(farm);
    }

}