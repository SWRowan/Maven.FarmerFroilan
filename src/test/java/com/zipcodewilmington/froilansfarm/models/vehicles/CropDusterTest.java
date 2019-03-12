package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.persons.FarmPilot;
import com.zipcodewilmington.froilansfarm.simulations.Sunday;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class CropDusterTest {
    ByteArrayOutputStream bytArrOutStr;

    @Test
    public void constructorTest1() {
        // Given
        CropDuster cropDuster = new CropDuster();

        // Then
        Assert.assertNotNull(cropDuster);
    }

    @Test
    public void constructorTest2() {
        // Given
        CropDuster cropDuster = new CropDuster();

        // Then
        Assert.assertFalse(cropDuster.isMounted());
    }

    @Test
    public void mountTest() {
        // Given
        CropDuster cropDuster = new CropDuster();

        // When
        cropDuster.mount();

        // Then
        Assert.assertTrue(cropDuster.isMounted());
    }

    @Test
    public void dismountTest() {
        // Given
        CropDuster cropDuster = new CropDuster();

        // When
        cropDuster.mount();
        cropDuster.dismount();

        // Then
        Assert.assertFalse(cropDuster.isMounted());
    }

    @Test
    public void makeNoiseTest() {
        // Given
        CropDuster cropDuster = new CropDuster();
        String expectedNoise = "*Crop Duster Noises*";

        // When
        String actualNoise = cropDuster.makeNoise();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void rideTest() {
        // Given
        bytArrOutStr = new ByteArrayOutputStream();
        getConsoleWithBufOut(bytArrOutStr);
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();
        String expectedOutput = "The crop duster has been ridden\n";

        // When
        cropDuster.ride(new FarmPilot("", farm));
        String actualOutput = bytArrOutStr.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void flyTest() {
        // Given
        bytArrOutStr = new ByteArrayOutputStream();
        getConsoleWithBufOut(bytArrOutStr);
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();
        String expectedOutput = "The crop duster has been flown\n";

        // When
        cropDuster.fly();
        String actualOutput = bytArrOutStr.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    //@Test
    public void operateTest1() {
        // Given
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();



        // When
        cropDuster.operate(farm);
        boolean actualIsFertilized = farm.getField().getCropRows().get(0).getCrops().get(0).isFertilized();

        // Then
        Assert.assertTrue(actualIsFertilized);
    }

    @Test
    public void operateTest2() {
        // Given
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();

        // When
        cropDuster.operate(farm);
        ArrayList<Crop> crops = new ArrayList<>();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            crops.addAll(cropRow.getCrops());
        }

        // Then
        for (Crop crop : crops) {
            Assert.assertTrue(crop.isFertilized());
        }
    }

    @Test
    public void fertilizeTest1() {
        // Given
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow(CornStalk.listToCropList(CornStalk.cornStalkList(100)));
        // When
        cropDuster.fertilize(cropRow);
        boolean actualIsFertilized = cropRow.getCrops().get(0).isFertilized();

        // Then
        Assert.assertTrue(actualIsFertilized);
    }

    @Test
    public void fertilizeTest2() {
        // Given
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster();

        // When
        cropDuster.fertilize(farm.getField().getCropRows().get(0));
        ArrayList<Crop> crops = farm.getField().getCropRows().get(0).getCrops();

        // Then
        for (Crop crop : crops) {
            Assert.assertTrue(crop.isFertilized());
        }
    }

    private IOConsole getConsoleWithBufOut(ByteArrayOutputStream baos) {
        return new IOConsole(System.in, new PrintStream(baos));
    }
}