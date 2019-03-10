package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;

import org.junit.Test;

public class TuesdayTest {
    Farm farm = new Farm();


    @Test
    public void testTuesdayWD(){
        //When
        Tuesday.tuesdayWorkDay(farm);
    }

    @Test
    public void testTractor(){
        //When
        Tuesday tuesday = new Tuesday();
        tuesday.morningRoutine(farm);
    }


}