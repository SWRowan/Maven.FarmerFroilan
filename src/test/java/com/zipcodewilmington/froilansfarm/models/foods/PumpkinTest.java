package com.zipcodewilmington.froilansfarm.models.foods;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PumpkinTest {

    @Test
    public void TestConstructor() {
        //Given
        Pumpkin pumpkin = new Pumpkin();
        Integer expected = 15;

        //When

        Integer actual = pumpkin.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);
    }

}