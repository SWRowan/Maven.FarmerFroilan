package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class EggTest {
    private HashMap<Food, Integer> storedFoods;
    private StoreHouse storeHouse;
    private ArrayList<Food> edibleEgg;
    private Egg egg;

    @Before
    public void setip() {
        storedFoods = new HashMap<>(storedFoods);
        storeHouse = new StoreHouse(storedFoods);
        edibleEgg = new ArrayList<>();
        egg = new Egg();
        edibleEgg.add(egg);
        storeHouse.addFood(edibleEgg);


    }

    @Test
    public void TestConstructor() {
        //Given
        Egg egg = new Egg();
        Integer expected = 5;

        //When

        Integer actual = egg.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Testeat() {

        //Given

        Integer expected = 0;

        //When

        egg.consumed(storeHouse, egg);
        Integer actual = storeHouse.checkStock(egg);

        //Then

        Assert.assertEquals(expected, actual);
    }

}