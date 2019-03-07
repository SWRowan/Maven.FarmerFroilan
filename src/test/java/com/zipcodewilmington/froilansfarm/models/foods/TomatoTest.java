package com.zipcodewilmington.froilansfarm.models.foods;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoTest {

    @Test
    public void TestConstructor() {
        //Given
        Tomato tomato = new Tomato();
        Integer expected = 2;

        //When

        Integer actual = tomato.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);
    }

}