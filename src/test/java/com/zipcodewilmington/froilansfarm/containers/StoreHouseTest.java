package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.foods.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class StoreHouseTest {
    private HashMap<Food, Integer> storedFood = new HashMap<>();
    private EarCorn earCorn = new EarCorn();
    private EarCorn earCorn2 = new EarCorn();
    private EarCorn earCorn3 = new EarCorn();
    private EarCorn earCorn4 = new EarCorn();
    private Pumpkin pumpkin = new Pumpkin();
    private Pumpkin pumpkin2 = new Pumpkin();
    private Pumpkin pumpkin3 = new Pumpkin();
    private Pumpkin pumpkin4 = new Pumpkin();
    private Pumpkin pumpkin5 = new Pumpkin();
    private Tomato tomato = new Tomato();
    private Egg egg = new Egg();
    private ArrayList<Food> foodList = new ArrayList<>();

    @Before
    public void setup(){
        foodList.add(pumpkin);
        foodList.add(pumpkin2);
        foodList.add(pumpkin3);
        foodList.add(pumpkin4);
        foodList.add(pumpkin5);
        foodList.add(earCorn);
        foodList.add(earCorn2);
        foodList.add(earCorn3);
        foodList.add(earCorn4);
        foodList.add(tomato);
        foodList.add(egg);
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
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);
        Integer expected = 5;
        //When
        storeHouse.addFood(foodList);
        Integer actual = storeHouse.checkStock(pumpkin);
        System.out.println(storeHouse.getStoredFoods());
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveFood1(){
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);
        storeHouse.addFood(foodList);
        Integer expected = 2;
        //When
        System.out.println(storeHouse.getStoredFoods());
        storeHouse.getFood(pumpkin, 3);
        Integer actual = storeHouse.checkStock(pumpkin);
        System.out.println(storeHouse.getStoredFoods());
        //Then
        assertEquals(expected, actual);
    }


    @Test
    public void testCheckStock(){
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);
        Integer expected = 4;
        //When
        storeHouse.addFood(foodList);
        Integer actual = storeHouse.checkStock(earCorn);
        System.out.println(storeHouse.checkStock(tomato) + storeHouse.checkStock(egg));
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodNull(){
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);

        //When
        Meal testfood = storeHouse.getFood(pumpkin, 6);
        //Then
        Assert.assertNull(testfood);
    }

    @Test
    public void testTypeNull(){
        //Given
        StoreHouse storeHouse = new StoreHouse(storedFood);
        Carrot carrot = new Carrot();
        //When
        Food food = storeHouse.typeOfFood(carrot);
        //Then
        Assert.assertNull(food);
    }



}