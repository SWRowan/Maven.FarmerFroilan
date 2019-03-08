package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Vehicle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class FarmPilotTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void makeNoiseTest(){
        // Given
        String expected = "Ruuun";
        FarmPilot farmPilot = new FarmPilot(null,new Farm());

        // When
        String actual = farmPilot.makeNoise();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){
        // Given
        FarmPilot farmPilot = new FarmPilot(null,new Farm());
        Vehicle vehicle = new CropDuster();

        // When
        farmPilot.mount(vehicle);
        Boolean actual = vehicle.isMounted();

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void dismountTest(){
        // Given
        FarmPilot farmPilot = new FarmPilot(null,new Farm());
        Vehicle vehicle = new CropDuster();

        // When
        farmPilot.mount(vehicle);
        farmPilot.dismount(vehicle);
        Boolean actual = vehicle.isMounted();

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void getMyFarmTest(){
        // Given
        Farm expected = new Farm();
        FarmPilot farmer = new FarmPilot(null, expected);
        // When
        Farm actual = farmer.getMyFarm();
        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setMyFarmTest(){
        // Given
        Farm expected = new Farm();
        FarmPilot farmer = new FarmPilot(null,new Farm());

        // When
        farmer.setMyFarm(expected);
        Farm actual = farmer.getMyFarm();

        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void flyTest(){
        // Given
        String expected = "The crop duster has been flown\n";
        FarmPilot farmer = new FarmPilot(null,new Farm());
        Aircraft aircraft = new CropDuster();

        // When
        farmer.fly(aircraft);
        outContent.toString();

        // Then
        Assert.assertEquals(expected, outContent.toString());
    }






}
