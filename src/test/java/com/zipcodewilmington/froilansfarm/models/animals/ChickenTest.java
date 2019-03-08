package com.zipcodewilmington.froilansfarm.models.animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void testConstructor(){
        //Given
        Chicken chicken = new Chicken();
        //Then
        System.out.println(chicken.getId());
    }



}