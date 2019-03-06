package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

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
    }
}