package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.Pumpkin;
import org.junit.Assert;
import org.junit.Test;

public class PumpkinPlantTest {

    @Test
    public void constructorTest1() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // Then
        Assert.assertNotNull(pumpkinPlant);
    }

    @Test
    public void constructorTest2() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // Then
        Assert.assertFalse(pumpkinPlant.isFertilized());
    }

    @Test
    public void constructorTest3() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // Then
        Assert.assertFalse(pumpkinPlant.isHarvested());
    }

    @Test
    public void fertilizeTest() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // When
        pumpkinPlant.fertilize();

        // Then
        Assert.assertTrue(pumpkinPlant.isFertilized());
    }

    @Test
    public void harvestTest1() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // When
        pumpkinPlant.harvest();

        // Then
        Assert.assertTrue(pumpkinPlant.isHarvested());
    }

    @Test
    public void toStringTest1() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();
        String expectedToString = pumpkinPlant.getClass().getSimpleName() + ", not fertilized";

        // When
        String actualToString = pumpkinPlant.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void toStringTest2() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();
        pumpkinPlant.fertilize();
        pumpkinPlant.harvest();
        String expectedToString = pumpkinPlant.getClass().getSimpleName() + ", fertilized";

        // When
        String actualToString = pumpkinPlant.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void yieldTest1() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // Then
        Assert.assertNull(pumpkinPlant.yield());
    }

    @Test
    public void yieldTest2() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // When
        pumpkinPlant.fertilize();

        // Then
        Assert.assertNull(pumpkinPlant.yield());
    }

    @Test
    public void yieldTest3() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // When
        pumpkinPlant.harvest();

        // Then
        Assert.assertNull(pumpkinPlant.yield());
    }

    @Test
    public void yieldTest4() {
        // Given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();

        // When
        pumpkinPlant.fertilize();
        pumpkinPlant.harvest();

        // Then
        Assert.assertTrue(pumpkinPlant.yield() instanceof Pumpkin);
    }

}