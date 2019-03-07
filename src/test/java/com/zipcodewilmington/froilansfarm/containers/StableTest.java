package com.zipcodewilmington.froilansfarm.containers;

import com.zipcodewilmington.froilansfarm.models.animals.Horse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StableTest {
    private ArrayList<Horse> horses;
    private Horse horse1 = new Horse("Lightning");
    private Horse horse2 = new Horse("Thunder");

    @Before
    public void setup(){
        this.horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
    }

    @Test
    public void testConstructor(){
        //Given
        Stable stable = new Stable(horses);
        //When
        String output = stable.getHorses();
        //Then
        System.out.println(output);
    }

    @Test
    public void testAddHorseToStable(){
        //Given
        Stable stable = new Stable(horses);
        Horse horse3 = new Horse("Bishop");
        //When
        stable.addHorseToStable(horse3);
        String output = stable.getHorses();
        //Then
        System.out.println(output);
    }
}