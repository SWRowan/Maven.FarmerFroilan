package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TomatoTest {


        private HashMap<Food, Integer> storedFoods;
        private StoreHouse storeHouse;
        private ArrayList<Food> edibleTomato;
        private Tomato tomato;

        @Before
        public void setup() {

            storedFoods = new HashMap<>();
            storeHouse = new StoreHouse(storedFoods);
            edibleTomato = new ArrayList<>();
            tomato = new Tomato();
            edibleTomato.add(tomato);
            storeHouse.addFood(edibleTomato);

        }
    @Test
    public void TestConstructor() {
        //Given
        Tomato tomato = new Tomato();
        Integer expected = 2;

        //When

        Integer actual = tomato.getEnergy();

        //Then

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testeat(){

        //Given
        Integer expected = 0;

        //When
        tomato.consumed(storeHouse, tomato);
        Integer actual = storeHouse.checkStock(tomato);

        //Then
        Assert.assertEquals(expected, actual);


    }
}