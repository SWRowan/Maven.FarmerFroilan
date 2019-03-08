package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class EarCornTest {
    private HashMap<Food, Integer> storedFoods;
    private StoreHouse storeHouse;
    private  ArrayList<Food> corn;
    private EarCorn earCorn;

    @Before
    public void setup() {

        storedFoods = new HashMap<>();
        storeHouse = new StoreHouse(storedFoods);
        corn = new ArrayList<>();
        earCorn = new EarCorn();
        corn.add(earCorn);
        storeHouse.addFood(corn);

    }

    @Test
    public void TestConstructor() {
        //Given
        EarCorn earCorn = new EarCorn();
        Integer expected = 10;

        //When

        Integer actual = earCorn.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Testeat(){

        //Given
       Integer expected = 0;

        //When
        earCorn.consumed(earCorn);
        Integer actual = storeHouse.checkStock(earCorn);

        //Then
        Assert.assertEquals(expected, actual);


    }
}