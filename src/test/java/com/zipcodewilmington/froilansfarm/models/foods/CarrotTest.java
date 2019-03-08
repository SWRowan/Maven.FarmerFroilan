package com.zipcodewilmington.froilansfarm.models.foods;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarrotTest {

    @Test
    public void testConstructor(){
        //Given
        Carrot carrot = new Carrot();
        //Then
        Assert.assertTrue(carrot instanceof Food);
    }

    @Test
    public void testConsume(){
        Carrot carrot = new Carrot();
        carrot.consumed();
    }

}