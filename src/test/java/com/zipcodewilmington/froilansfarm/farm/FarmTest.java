package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FarmTest {

    @Test
    public void runTest1() {
        // Given
        String input = "no\n";
        ByteArrayInputStream bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream bytArrOutStr = new ByteArrayOutputStream();
        Farm farm = new Farm(bytArrInpStr, new PrintStream(bytArrOutStr));

        String expectedOutput = "Would you like to begin farming?\n" +
                "Thanks for visiting the farm today!\n";

        // When
        farm.run();
        String actualOutput = bytArrOutStr.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void runTest2() {
        // Given
        String input = "no\n";
        ByteArrayInputStream bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        Farm farm = new Farm(bytArrInpStr, System.out);

        int expectedDaysElapsed = 0;

        // When
        farm.run();
        int actualDaysElapsed = farm.getDaysElapsed();

        // Then
        Assert.assertEquals(expectedDaysElapsed, actualDaysElapsed);
    }

    @Test
    public void runTest3() {
        // Given
        String input = "yes\n\nyes\nno\n";
        ByteArrayInputStream bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        Farm farm = new Farm(bytArrInpStr, System.out);

        int expectedDaysElapsed = 1;

        // When
        farm.run();
        int actualDaysElapsed = farm.getDaysElapsed();

        // Then
        Assert.assertEquals(expectedDaysElapsed, actualDaysElapsed);
    }

    @Test
    public void runTest4() {
        // Given
        String input = "yes\n\nyes\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nno\n";
        ByteArrayInputStream bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        Farm farm = new Farm(bytArrInpStr, System.out);

        int expectedDaysElapsed = 8;

        // When
        farm.run();
        int actualDaysElapsed = farm.getDaysElapsed();

        // Then
        Assert.assertEquals(expectedDaysElapsed, actualDaysElapsed);
    }

    @Test
    public void constructorTest1() {
        // Given
        Farm farm = new Farm();
        int expectedDaysElapsed = 0;

        // When
        int actualDaysElapsed = farm.getDaysElapsed();

        // Then
        Assert.assertEquals(expectedDaysElapsed, actualDaysElapsed);
    }

    @Test
    public void constructorTest2() {
        // Given
        Farm farm = new Farm();

        // Then
        Assert.assertNotNull(farm.getChickenCoops());
    }

    @Test
    public void constructorTest3() {
        // Given
        Farm farm = new Farm();

        // Then
        Assert.assertNotNull(farm.getFarmHouse());
    }

    @Test
    public void constructorTest4() {
        // Given
        Farm farm = new Farm();

        // Then
        Assert.assertNotNull(farm.getField());
    }

    @Test
    public void constructorTest5() {
        // Given
        Farm farm = new Farm();

        // Then
        Assert.assertNotNull(farm.getGarage());
    }

    @Test
    public void constructorTest6() {
        // Given
        Farm farm = new Farm();

        // Then
        Assert.assertNotNull(farm.getStables());
    }

    @Test
    public void constructorTest7() {
        // Given
        Farm farm = new Farm();

        // Then
        Assert.assertNotNull(farm.getStoreHouse());
    }
}