package com.zipcodewilmington.froilansfarm.models.foods;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TomatoTest {
        private HashMap<Food, Integer> storedFoods = new HashMap<>();
        private StoreHouse storeHouse = new StoreHouse(storedFoods);
        private ArrayList<Food> edibleTomato = new ArrayList<>();
        private Tomato tomato = new Tomato();

        @Before
        public void setup() {
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

//    @Test
//    public void Testeat(){
//
//        //Given
//        Integer expected = 0;
//
//        //When
//        System.out.println(storeHouse.getStoredFoods());
//        tomato.consumed(storeHouse);
//        Integer actual = storeHouse.checkStock(tomato);
//        System.out.println(storeHouse.getStoredFoods());
//
//        //Then
//        Assert.assertEquals(expected, actual);
//
//
//    }
}