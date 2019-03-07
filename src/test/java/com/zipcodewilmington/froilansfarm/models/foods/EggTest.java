package com.zipcodewilmington.froilansfarm.models.foods;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void TestConstructor() {
        //Given
        Egg egg = new Egg();
        Integer expected = 5;

        //When

        Integer actual = egg.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);

    }

}