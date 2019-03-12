package com.zipcodewilmington.froilansfarm.models.vehicles;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.models.crops.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.models.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.foods.Pumpkin;
import com.zipcodewilmington.froilansfarm.models.foods.Tomato;
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

    //@Test
    public void operateTest2() {
        // Given
        Farm farm = new Farm();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.fertilizeCrops();
        }
        Tractor tractor = new Tractor();
        int expectedSize = 0; // total number of crops on this farm

        // When
        int actualSize = tractor.operate(farm).size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void operateTest3() {
        // Given
        Farm farm = new Farm();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.fertilizeCrops();
        }
        Tractor tractor = new Tractor();

        int expectedEarCorns = 0;
        for (CropRow cropRow : farm.getField().getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                if (crop instanceof CornStalk) {
                    expectedEarCorns++;
                }
            }
        }

        // When
        int actualEarCorns = 0;
        for (Food food : tractor.operate(farm)) {
            if (food instanceof EarCorn) {
                actualEarCorns++;
            }
        }


        // Then
        Assert.assertEquals(expectedEarCorns, actualEarCorns);
    }

    @Test
    public void operateTest4() {
        // Given
        Farm farm = new Farm();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.fertilizeCrops();
        }
        Tractor tractor = new Tractor();

        int expectedTomatoes = 0;
        for (CropRow cropRow : farm.getField().getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                if (crop instanceof TomatoPlant) {
                    expectedTomatoes++;
                }
            }
        }

        // When
        int actualTomatoes = 0;
        for (Food food : tractor.operate(farm)) {
            if (food instanceof Tomato) {
                actualTomatoes++;
            }
        }

        // Then
        Assert.assertEquals(expectedTomatoes, actualTomatoes);
    }

    @Test
    public void operateTest5() {
        // Given
        Farm farm = new Farm();
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.fertilizeCrops();
        }
        Tractor tractor = new Tractor();

        int expectedPumpkins = 0;
        for (CropRow cropRow : farm.getField().getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                if (crop instanceof PumpkinPlant) {
                    expectedPumpkins++;
                }
            }
        }

        // When
        int actualPumpkins = 0;
        for (Food food : tractor.operate(farm)) {
            if (food instanceof Pumpkin) {
                actualPumpkins++;
            }
        }

        // Then
        Assert.assertEquals(expectedPumpkins, actualPumpkins);
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
        int expectedSize = 0; // total number of crops in first cropRow

        // When
        int actualSize = tractor.harvest(farm.getField().getCropRows().get(0)).size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    private IOConsole getConsoleWithBufOut(ByteArrayOutputStream baos) {
        return new IOConsole(System.in, new PrintStream(baos));
    }

}