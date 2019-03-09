package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void constructorTest1() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop(new ArrayList<>());

        // Then
        Assert.assertNotNull(chickenCoop);
    }

    @Test
    public void constructorTest2() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop(new ArrayList<>());
        int expectedSize = 0;

        // When
        int actualSize = chickenCoop.getChickens().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorTest3() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop(new ArrayList<>(Arrays.asList(new Chicken(), new Chicken())));
        int expectedSize = 2;

        // When
        int actualSize = chickenCoop.getChickens().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void setChickensTest() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop(new ArrayList<>());
        int expectedSize = 3;

        // When
        chickenCoop.setChickens(new ArrayList<>(Arrays.asList(new Chicken(), new Chicken(), new Chicken())));
        int actualSize = chickenCoop.getChickens().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void toStringTest() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop(new ArrayList<>());
        String expectedToString = "\nChickenCoop{chickens=[]}";

        // When
        String actualToString = chickenCoop.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }


}