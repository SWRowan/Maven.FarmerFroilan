package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import org.junit.Assert;
import org.junit.Test;

public class MealTest {

    @Test
    public void testConstructor(){
        //Given
        Food expectedFood = new EarCorn();
        Integer expectedNum = 3;
        Meal meal = new Meal(expectedFood, expectedNum);
        //When
        Food actualFood = meal.getFood();
        Integer actualNum = meal.getNumOfFood();
        //Then
        Assert.assertEquals(expectedNum, actualNum);
        Assert.assertEquals(expectedFood, actualFood);
    }
}