package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.models.crops.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.models.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CropRowTest {
    
    @Test
    public void constructorTest1() {
        // Given
        CropRow cropRow = new CropRow(new ArrayList<>());

        // Then
        Assert.assertNotNull(cropRow);
    }

    @Test
    public void constructorTest2() {
        // Given
        CropRow cropRow = new CropRow(new ArrayList<>());
        int expectedSize = 0;

        // When
        int actualSize = cropRow.getCrops().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorTest3() {
        // Given
        CropRow cropRow = new CropRow(new ArrayList<>(Arrays.asList(new TomatoPlant(), new PumpkinPlant())));
        int expectedSize = 2;

        // When
        int actualSize = cropRow.getCrops().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void toStringTest() {
        // Given
        CropRow cropRow = new CropRow(new ArrayList<>());
        String expectedToString = "\nCropRow{crops=[]}";

        // When
        String actualToString = cropRow.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void fertilizeCrops() {
        // Given
        CropRow cropRow = new CropRow(new ArrayList<>(Arrays.asList(new TomatoPlant(), new PumpkinPlant())));

        // When
        cropRow.fertilizeCrops();

        // Then
        for (Crop crop : cropRow.getCrops()) {
            Assert.assertTrue(crop.isFertilized());
        }
    }

    @Test
    public void harvestCrops() {
        // Given
        CropRow cropRow = new CropRow(new ArrayList<>(Arrays.asList(new TomatoPlant(), new PumpkinPlant())));
        int expectedSize = 0;

        // When
        cropRow.harvestCrops();
        int actualSize = cropRow.getCrops().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

//    @Test
//    public void plantCrop() {
//        // Given
//        CropRow cropRow = new CropRow(new ArrayList<>());
//        int expectedSize = 3;
//
//        // When
//        cropRow.plantCrop(new TomatoPlant());
//        cropRow.plantCrop(new PumpkinPlant());
//        cropRow.plantCrop(new CornStalk());
//        int actualSize = cropRow.getCrops().size();
//
//        // Then
//        Assert.assertEquals(expectedSize, actualSize);
//    }
}