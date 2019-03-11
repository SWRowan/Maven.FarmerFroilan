package com.zipcodewilmington.froilansfarm.containers;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
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

    @Test
    public void testGetTractor(){
        //Given
        Farm farm = new Farm();
        //When
        Tractor tractor = farm.getGarage().getTractor(farm);
        //Then
        Assert.assertTrue(tractor instanceof Tractor);
    }

    @Test
    public void testGetTractorNull(){
        //Given

        Garage garage = new Garage(new ArrayList<>());
        Farm farm = new Farm(garage);
        //When
        Tractor tractor = farm.getGarage().getTractor(farm);
        //Then
        Assert.assertNull(tractor);
    }

    @Test
    public void testGetCD(){
        //Given
        Farm farm = new Farm();
        //When
        CropDuster cropDuster = farm.getGarage().getCropDuster();
        //Then
        Assert.assertTrue(cropDuster instanceof CropDuster);
    }

    @Test
    public void testGetCDNull(){
        //Given

        Garage garage = new Garage(new ArrayList<>());
        Farm farm = new Farm(garage);
        //When
        CropDuster cropDuster = farm.getGarage().getCropDuster();
        //Then
        Assert.assertNull(cropDuster);
    }
}