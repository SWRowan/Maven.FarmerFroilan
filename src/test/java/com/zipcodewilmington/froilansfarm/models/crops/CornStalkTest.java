package com.zipcodewilmington.froilansfarm.models.crops;

import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void constructorTest1() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // Then
        Assert.assertNotNull(cornStalk);
    }

    @Test
    public void constructorTest2() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // Then
        Assert.assertFalse(cornStalk.isFertilized());
    }

    @Test
    public void constructorTest3() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // Then
        Assert.assertFalse(cornStalk.isHarvested());
    }

    @Test
    public void fertilizeTest() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // When
        cornStalk.fertilize();

        // Then
        Assert.assertTrue(cornStalk.isFertilized());
    }

    @Test
    public void harvestTest1() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // When
        cornStalk.harvest();

        // Then
        Assert.assertTrue(cornStalk.isHarvested());
    }

    @Test
    public void toStringTest1() {
        // Given
        CornStalk cornStalk = new CornStalk();
        String expectedToString = cornStalk.getClass().getSimpleName() + ", not fertilized, not harvested";

        // When
        String actualToString = cornStalk.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void toStringTest2() {
        // Given
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        cornStalk.harvest();
        String expectedToString = cornStalk.getClass().getSimpleName() + ", fertilized, harvested";

        // When
        String actualToString = cornStalk.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void yieldTest1() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // Then
        Assert.assertNull(cornStalk.yield());
    }

    @Test
    public void yieldTest2() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // When
        cornStalk.fertilize();

        // Then
        Assert.assertNull(cornStalk.yield());
    }

    @Test
    public void yieldTest3() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // When
        cornStalk.harvest();

        // Then
        Assert.assertNull(cornStalk.yield());
    }

    @Test
    public void yieldTest4() {
        // Given
        CornStalk cornStalk = new CornStalk();

        // When
        cornStalk.fertilize();
        cornStalk.harvest();

        // Then
        Assert.assertTrue(cornStalk.yield() instanceof EarCorn);
    }

}