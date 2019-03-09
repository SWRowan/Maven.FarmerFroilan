package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.models.foods.Egg;
import com.zipcodewilmington.froilansfarm.models.foods.Food;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void testConstructor() {
        //Given
        Chicken chicken = new Chicken();
        //Then
        Assert.assertTrue(chicken instanceof Chicken);
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void testMakeNoise() {
        //Given
        Chicken chicken = new Chicken();
        //Then
        System.out.println(chicken.makeNoise());
    }

    @Test
    public void testYeild1() {
        //Given
        Chicken chicken = new Chicken();
        //When
        Food food = chicken.yield();
        //Then
        Assert.assertTrue(food instanceof Egg);
    }

    @Test
    public void testYeild2() {
        //Given
        Chicken chicken = new Chicken();
        //When
        chicken.fertilize();
        Food food = chicken.yield();
        //Then
        Assert.assertNull(food);
    }

    @Test
    public void testIsFertilized() {
        //Given
        Chicken chicken = new Chicken();
        //Then
        Assert.assertFalse(chicken.isFertilized());
        //When
        chicken.fertilize();
        //Then
        Assert.assertTrue(chicken.isFertilized());
    }

    @Test
    public void testEat() {
        //Given
        Chicken chicken = new Chicken();
        Meal meal = new Meal(new EarCorn(), 1);
        //Then
        chicken.eat(meal);
    }

    @Test
    public void testToString() {
        //Given
        Chicken chicken = new Chicken();
        //Then
        System.out.println(chicken.toString());
    }

    @Test
    public void testChickenList() {
        //Given
        Integer expected = 10;
        //When
        Integer actual = Chicken.chickenList(10).size();
        //Then
        Assert.assertEquals(expected, actual);
    }

}