package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class EarCornTest {
    private HashMap<Food, Integer> storedFoods = new HashMap<>();
    private StoreHouse storeHouse = new StoreHouse(storedFoods);
    private ArrayList<Food> corn = new ArrayList<>();
    private EarCorn earCorn = new EarCorn();

    @Before
    public void setup() {
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
    public void testConsumed() {
        EarCorn earCorn = new EarCorn();
        earCorn.consumed();
    }

    @Test
    public void testCornList(){
        //Given
        Integer expected = 10;
        //When
        Integer actual = EarCorn.cornList(10).size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}