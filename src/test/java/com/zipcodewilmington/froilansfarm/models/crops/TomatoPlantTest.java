package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void constructorTest1() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // Then
        Assert.assertNotNull(tomatoPlant);
    }

    @Test
    public void constructorTest2() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // Then
        Assert.assertFalse(tomatoPlant.isFertilized());
    }

    @Test
    public void constructorTest3() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // Then
        Assert.assertFalse(tomatoPlant.isHarvested());
    }

    @Test
    public void fertilizeTest() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // When
        tomatoPlant.fertilize();

        // Then
        Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void harvestTest1() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // When
        tomatoPlant.harvest();

        // Then
        Assert.assertTrue(tomatoPlant.isHarvested());
    }

    @Test
    public void toStringTest1() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        String expectedToString = tomatoPlant.getClass().getSimpleName() + ", not fertilized, not harvested";

        // When
        String actualToString = tomatoPlant.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void toStringTest2() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        tomatoPlant.harvest();
        String expectedToString = tomatoPlant.getClass().getSimpleName() + ", fertilized, harvested";

        // When
        String actualToString = tomatoPlant.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void yieldTest1() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // Then
        Assert.assertNull(tomatoPlant.yield());
    }

    @Test
    public void yieldTest2() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // When
        tomatoPlant.fertilize();

        // Then
        Assert.assertNull(tomatoPlant.yield());
    }

    @Test
    public void yieldTest3() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // When
        tomatoPlant.harvest();

        // Then
        Assert.assertNull(tomatoPlant.yield());
    }

    @Test
    public void yieldTest4() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        // When
        tomatoPlant.fertilize();
        tomatoPlant.harvest();

        // Then
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

}