package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.CropRow;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.models.crops.Crop;
import com.zipcodewilmington.froilansfarm.models.crops.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.models.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.models.vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;

public class FarmerTest {



    @Test
    public void instanceOfTest(){
        Farmer farmer = new Farmer(null,new Farm());
        Assert.assertThat(farmer,instanceOf(Person.class));
        //12-20
    }

    @Test
    public void getNameTest(){
        String expected = "Bob";
        Farmer farmer = new Farmer("Bob",new Farm());

        String actual = farmer.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getMyFarmTest(){
        // Given
        Farm expected = new Farm();
        Farmer farmer = new Farmer(null, expected);
        // When
        Farm actual = farmer.getMyFarm();
        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setMyFarmTest(){
        // Given
        Farm expected = new Farm();
        Farmer farmer = new Farmer(null,new Farm());

        // When
        farmer.setMyFarm(expected);
        Farm actual = farmer.getMyFarm();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){
        // Given
        Farmer farmer = new Farmer(null,new Farm());
        CropDuster cropDuster = new CropDuster();
        Vehicle vehicle = cropDuster;

        // When
        farmer.mount( cropDuster );
        Boolean actual = vehicle.isMounted();
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void dismountTest(){
        // Given
        Farmer farmer = new Farmer(null,new Farm());
        CropDuster cropDuster = new CropDuster();
        Vehicle vehicle = cropDuster;

        // When
        farmer.mount( cropDuster );
        Boolean actual = vehicle.isMounted();
        // Then

        // When
        farmer.dismount( cropDuster );
        actual = vehicle.isMounted();
        // Then
        Assert.assertFalse(actual);
    }


    @Test
    public void makeNoiseTest(){
        // Given
        Farmer farmer = new Farmer(null,new Farm());


        // When
        String actual = farmer.makeNoise();

        // Then
        System.out.println(actual);
    }

    @Test
    public void plantTest(){
        Integer expected = 1;
        Farmer farmer = new Farmer(null,new Farm());
        CropRow cropRow = new CropRow(new ArrayList<>());
        ArrayList<Crop> list = new ArrayList<>();
        list.add(new CornStalk());

        farmer.plant(list,cropRow);


        Integer actual = cropRow.getCrops().size();

        Assert.assertEquals(expected,actual);
    }
}
