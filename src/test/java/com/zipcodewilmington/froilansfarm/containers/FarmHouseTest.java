package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FarmHouseTest {

    @Test
    public void constructorTest1() {
        // Given
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>());

        // Then
        Assert.assertNotNull(farmHouse);
    }

    @Test
    public void constructorTest2() {
        // Given
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>());
        int expectedSize = 0;

        // When
        int actualSize = farmHouse.getPersons().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorTest3() {
        // Given
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>(Arrays.asList(new Farmer("", null), new FarmPilot("", null))));
        int expectedSize = 2;

        // When
        int actualSize = farmHouse.getPersons().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void setPersonsTest() {
        // Given
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>());
        int expectedSize = 3;

        // When
        farmHouse.setPersons(new ArrayList<>(Arrays.asList(new Farmer("", null), new FarmPilot("", null), new Farmer("", null))));
        int actualSize = farmHouse.getPersons().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void toStringTest() {
        // Given
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>());
        String expectedToString = "\nFarmHouse{persons=[]}";

        // When
        String actualToString = farmHouse.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void testGetRider(){
        //Given
        Farm farm = new Farm();
        //
        Rider rider = farm.getFarmHouse().getRider();
        //Then
        Assert.assertTrue(rider instanceof Rider);
    }

    @Test
    public void testGetRider2(){
        //Given
        FarmHouse farmHouse = new FarmHouse(new ArrayList<>());
        //
        Rider rider = farmHouse.getRider();
        //Then
        Assert.assertNull(rider);
    }

}