package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HorseTest {
    private HashMap<Food, Integer> foodStock = new HashMap<>();
    private StoreHouse storeHouse = new StoreHouse(foodStock);
    private ArrayList<Food> foodList = new ArrayList<>();


    @Before
    public void setup(){

    }


    @Test
    public void testConstructor1() {
        //Given
        Horse horse = new Horse();
        String expected = "";
        //When
        String actual = horse.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor2() {
        //Given
        String expected = "SeaBass";
        Horse horse = new Horse(expected);
        //When
        String actual = horse.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        Horse horse = new Horse();
        String expected = "King Kong";
        //When
        horse.setName(expected);
        String actual = horse.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise() {
        //Given
        Horse horse = new Horse();
        //Then
        System.out.println(horse.makeNoise());
    }

    @Test
    public void testEat(){
        //Given

    }



}