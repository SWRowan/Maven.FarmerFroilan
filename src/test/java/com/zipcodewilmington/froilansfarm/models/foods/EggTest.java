package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class EggTest {
    private HashMap<Food, Integer> storedFoods = new HashMap<>();
    private StoreHouse storeHouse = new StoreHouse(storedFoods);
    private ArrayList<Food> edibleEgg = new ArrayList<>();
    private Egg egg = new Egg();
    private Egg egg2 = new Egg();


    @Before
    public void setup() {
        edibleEgg.add(egg);
        edibleEgg.add(egg2);
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
    public void testConsumed() {
        Egg egg = new Egg();
        egg.consumed();
    }

    @Test
    public void testEggLists(){
        //Given
        Integer expected = 3;
        //When
        Integer actual = Egg.listToFoodList(Egg.eggList(3)).size();
        //then
        Assert.assertEquals(expected, actual);
    }
}