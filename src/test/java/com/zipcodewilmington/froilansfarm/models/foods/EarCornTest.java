package com.zipcodewilmington.froilansfarm.models.foods;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarCornTest {

    @Test
    public void TestConstructor(){
        //Given
        EarCorn earCorn = new EarCorn();
        Integer expected = 10;

        //When

        Integer actual = earCorn.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);


    }
}