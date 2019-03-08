package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlateOfFoodTest {

    @Test
    public void testConstructor(){
        //Given
        Food expectedFood = new EarCorn();
        Integer expectedNum = 3;
        PlateOfFood plateOfFood = new PlateOfFood(expectedFood, expectedNum);
        //When
        Food actualFood = plateOfFood.getFood();
        Integer actualNum = plateOfFood.getNumOfFood();
        //Then
        Assert.assertEquals(expectedNum, actualNum);
        Assert.assertEquals(expectedFood, actualFood);
    }
}