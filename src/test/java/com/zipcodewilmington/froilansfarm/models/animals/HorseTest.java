package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.PlateOfFood;
import com.zipcodewilmington.froilansfarm.containers.StoreHouse;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import com.zipcodewilmington.froilansfarm.models.persons.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class HorseTest {
    private HashMap<Food, Integer> foodStock = new HashMap<>();
    private StoreHouse storeHouse = new StoreHouse(foodStock);
    private ArrayList<Food> foodList = new ArrayList<>();
    private EarCorn earCorn1 = new EarCorn();
    private EarCorn earCorn2 = new EarCorn();
    private EarCorn earCorn3 = new EarCorn();

    @Before
    public void setup() {
        foodList.add(earCorn1);
        foodList.add(earCorn2);
        foodList.add(earCorn3);
        storeHouse.addFood(foodList);

    }


    @Test
    public void testConstructor1() {
        //Given
        Horse horse = new Horse();
        String expected = "Horse";
        //When
        String actual = horse.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor2() {
        //Given
        String expected = "SeaBass";
        Horse horse = Horse.createHorse(expected);
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
    public void testEat() {
        //Given
        Horse horse = Horse.createHorse("Boah");
        //When
        System.out.println(storeHouse.getStoredFoods());
        PlateOfFood plateOfFood = storeHouse.getFood(earCorn1, 3);
        horse.eat(plateOfFood);
        System.out.println(storeHouse.getStoredFoods());


    }

    @Test
    public void testMountDismount(){
        //Given
        Horse horse = Horse.createHorse("Steven");
        //when
        horse.mount();
        //Then
        Assert.assertTrue(horse.isMounted());
        //When
        horse.dismount();
        //Then
        Assert.assertFalse(horse.isMounted());
    }

    @Test
    public void testRide(){
        //Given
        Farm farm = new Farm();
        Horse horse = Horse.createHorse("Behemoth");
        Farmer farmer = new Farmer("Bubba", farm);
        //When
        horse.mount();
        //Then
        horse.ride(farmer);
    }

    @Test
    public void testHorseList(){
        //Given
        Integer expected = 10;
        //When
        Integer actual = Horse.horseList(10).size();
        //Then
        Assert.assertEquals(expected, actual);
    }



}