package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TractorTest {
    private ByteArrayOutputStream bytArrOutStr;

    @Test
    public void constructorTest1() {
        // Given
        Tractor tractor = new Tractor();

        // Then
        Assert.assertNotNull(tractor);
    }

    @Test
    public void constructorTest2() {
        // Given
        Tractor tractor = new Tractor();

        // Then
        Assert.assertFalse(tractor.isMounted());
    }

    @Test
    public void mountTest() {
        // Given
        Tractor tractor = new Tractor();

        // When
        tractor.mount();

        // Then
        Assert.assertTrue(tractor.isMounted());
    }

    @Test
    public void dismountTest() {
        // Given
        Tractor tractor = new Tractor();

        // When
        tractor.mount();
        tractor.dismount();

        // Then
        Assert.assertFalse(tractor.isMounted());
    }

    @Test
    public void operateTest1() {
        // Given
        Farm farm = new Farm();
        Tractor tractor = new Tractor();
        int expectedSize = 0; // food ArrayList will be empty since none of the crops are fertilized

        // When
        int actualSize = tractor.operate(farm).size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void operateTest2() {
        // Given
        Farm farm = new Farm();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.fertilizeCrops();
        }
        Tractor tractor = new Tractor();
        int expectedSize = 39;

        // When
        int actualSize = tractor.operate(farm).size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void rideTest() {
        // Given
        bytArrOutStr = new ByteArrayOutputStream();
        getConsoleWithBufOut(bytArrOutStr);
        Farm farm = new Farm();
        Tractor tractor = new Tractor();
        String expectedOutput = "The tractor has been ridden\n";

        // When
        tractor.ride(new Farmer("", farm));
        String actualOutput = bytArrOutStr.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void makeNoiseTest() {
        // Given
        Tractor tractor = new Tractor();
        String expectedNoise = "*Tractor Noises*";

        // When
        String actualNoise = tractor.makeNoise();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void harvestTest1() {
        // Given
        Farm farm = new Farm();
        Tractor tractor = new Tractor();
        int expectedSize = 0; // food ArrayList will be empty since none of the crops are fertilized

        // When
        int actualSize = tractor.harvest(farm.getField().getCropRows().get(0)).size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void harvestTest2() {
        // Given
        Farm farm = new Farm();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.fertilizeCrops();
        }
        Tractor tractor = new Tractor();
        int expectedSize = 11;

        // When
        int actualSize = tractor.harvest(farm.getField().getCropRows().get(0)).size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    private IOConsole getConsoleWithBufOut(ByteArrayOutputStream baos) {
        return new IOConsole(System.in, new PrintStream(baos));
    }
}