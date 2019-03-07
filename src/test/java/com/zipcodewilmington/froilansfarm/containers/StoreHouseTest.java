package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.foods.Pumpkin;
import com.zipcodewilmington.froilansfarm.models.foods.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StoreHouseTest {
    private HashMap<Food, Integer> storedFood;
    private EarCorn earCorn = new EarCorn();
    private Tomato tomato = new Tomato();
    private Pumpkin pumpkin = new Pumpkin();

    @Before
    public void setup(){
        this.storedFood = new HashMap<>();
        storedFood.put(earCorn, 3);
        storedFood.put(tomato, 0);
        storedFood.put(pumpkin, 0);
    }
    @Test
    public void testConstructor(){
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);
        //When
        String output = storeHouse.getStoredFoods();
        //Then
        System.out.println(output);

    }

    @Test
    public void testAddFood(){
        //When
        StoreHouse storeHouse = new StoreHouse(storedFood);
        Integer expected = 5;
        //When
        storeHouse.addFood(tomato, 5);
        Integer actual = storedFood.get(tomato);
        String output = storeHouse.getStoredFoods();
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(output);
    }

    @Test
    public void testRemoveFood1(){
        //When
        StoreHouse storeHouse = new StoreHouse(storedFood);
        Integer expected = 5;
        //When
        storeHouse.addFood(tomato, 10);
        storeHouse.removeFood(tomato, 5);
        Integer actual = storedFood.get(tomato);
        String output = storeHouse.getStoredFoods();
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(output);
    }

    @Test
    public void testRemoveFood2(){
        //When
        StoreHouse storeHouse = new StoreHouse(storedFood);
        //Integer expected = 5;
        //When
        storeHouse.addFood(tomato, 10);
        storeHouse.removeFood(tomato, 11);
        //Integer actual = storedFood.get(tomato);
        String output = storeHouse.getStoredFoods();
        //Then
        //Assert.assertEquals(expected, actual);
        System.out.println(output);
    }

    @Test
    public void testCheckStock(){
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);
        Integer expected = 3;
        //When
        Integer actual = storeHouse.checkStock(earCorn);
        //then
        Assert.assertEquals(expected, actual);
    }

}