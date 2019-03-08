package com.zipcodewilmington.froilansfarm.containers;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GarageTest {

    @Test
    public void constructorTest1() {
        // Given
        Garage garage = new Garage(new ArrayList<>());

        // Then
        Assert.assertNotNull(garage);
    }

    @Test
    public void constructorTest2() {
        // Given
        Garage garage = new Garage(new ArrayList<>());
        int expectedSize = 0;

        // When
        int actualSize = garage.getVehicles().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorTest3() {
        // Given
        Garage garage = new Garage(new ArrayList<>(Arrays.asList(new Tractor(), new CropDuster())));
        int expectedSize = 2;

        // When
        int actualSize = garage.getVehicles().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void setVehiclesTest() {
        // Given
        Garage garage = new Garage(new ArrayList<>());
        int expectedSize = 3;

        // When
        garage.setVehicles(new ArrayList<>(Arrays.asList(new CropDuster(), new Tractor(), new CropDuster())));
        int actualSize = garage.getVehicles().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void toStringTest() {
        // Given
        Garage garage = new Garage(new ArrayList<>());
        String expectedToString = "\nGarage{vehicles=[]}";

        // When
        String actualToString = garage.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }
}