package com.zipcodewilmington.froilansfarm.containers.farm;

import com.zipcodewilmington.froilansfarm.utilities.IOConsole;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FarmTest {
    private ByteArrayInputStream bytArrInpStr;
    private ByteArrayOutputStream bytArrOutStr;

    @Test
    public void runTest1() {
        // Given
        String input = "no\n";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        bytArrOutStr = new ByteArrayOutputStream();
        getConsoleWithBufInpOut(bytArrInpStr, bytArrOutStr);
        Farm farm = new Farm();

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
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        getConsoleWithBufInp(bytArrInpStr);
        Farm farm = new Farm();

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
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        getConsoleWithBufInp(bytArrInpStr);
        Farm farm = new Farm();

        int expectedDaysElapsed = 1;

        // When
        farm.run();
        int actualDaysElapsed = farm.getDaysElapsed();

        // Then
        Assert.assertEquals(expectedDaysElapsed, actualDaysElapsed);
    }

    //@Test
    public void runTest4() {
        // Given
        String input = "yes\n\nyes\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nyes\n\nno\nno\n";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        getConsoleWithBufInp(bytArrInpStr);
        Farm farm = new Farm();

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

    private IOConsole getConsoleWithBufInpOut(ByteArrayInputStream bais, ByteArrayOutputStream baos) {
        return new IOConsole(bais, new PrintStream(baos));
    }

    private IOConsole getConsoleWithBufOut(ByteArrayOutputStream baos) {
        return new IOConsole(System.in, new PrintStream(baos));
    }

    private IOConsole getConsoleWithBufInp(ByteArrayInputStream bais) {
        return new IOConsole(bais, System.out);
    }
}