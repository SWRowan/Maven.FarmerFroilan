package com.zipcodewilmington.froilansfarm.models.animals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void testConstructor1() {
        //Given
        Horse horse = new Horse();
        String expected = "";
        //When
        String actual = horse.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor2() {
        //Given
        String expected = "SeaBass";
        Horse horse = new Horse(expected);
        //When
        String actual = horse.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        Horse horse = new Horse();
        String expected = "King Kong";
        //When
        horse.setName(expected);
        String actual = horse.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //Given
        Horse horse = new Horse();
        //Then
        horse.makeNoise();
    }



}