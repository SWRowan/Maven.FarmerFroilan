package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class PumpkinTest {

    private HashMap<Food, Integer> storedFoods = new HashMap<>();
    private StoreHouse storeHouse = new StoreHouse(storedFoods);
    private ArrayList<Food> ediblePumpkin = new ArrayList<>();
    private Pumpkin pumpkin = new Pumpkin();

    @Before
    public void setup() {
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

    @Test
    public void testConsumed() {
        Pumpkin pumpkin = new Pumpkin();
        pumpkin.consumed();
    }

}