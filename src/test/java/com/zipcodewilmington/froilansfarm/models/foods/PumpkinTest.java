package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class PumpkinTest {

    private HashMap<Food, Integer> storedFoods;
    private StoreHouse storeHouse;
    private ArrayList<Food> ediblePumpkin;
    private Pumpkin pumpkin;

    @Before
    public void setup(){
        storedFoods = new HashMap<>(storedFoods);
        storeHouse = new StoreHouse(storedFoods);
        ediblePumpkin = new ArrayList<>();
        Pumpkin = new Pumpkin();
        ediblePumpkin.add(pumpkin);
        storeHouse.addFood(ediblePumpkin);


    }


    @Test
    public void TestConstructor() {
        //Given
        Pumpkin pumpkin = new Pumpkin();
        Integer expected = 15;

        //When

        Integer actual = pumpkin.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);
        
    }

}