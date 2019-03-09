package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.foods.Food;

public class Meal {

    private Food food;
    private Integer numOfFood;

    public Meal(Food food, Integer numOfFood){
    this.food = food;
    this.numOfFood = numOfFood;


    }


    public Food getFood() {
        return food;
    }

    public Integer getNumOfFood() {
        return numOfFood;
    }





}
