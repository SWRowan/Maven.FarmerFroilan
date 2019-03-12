package com.zipcodewilmington.froilansfarm.containers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FieldTest {

    @Test
    public void constructorTest1() {
        // Given
        Field field = new Field(new ArrayList<>());

        // Then
        Assert.assertNotNull(field);
    }

    @Test
    public void constructorTest2() {
        // Given
        Field field = new Field(new ArrayList<>());
        int expectedSize = 0;

        // When
        int actualSize = field.getCropRows().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void constructorTest3() {
        // Given
        Field field = new Field(new ArrayList<>(Arrays.asList(new CropRow(null), new CropRow(null))));
        int expectedSize = 2;

        // When
        int actualSize = field.getCropRows().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void setCropRowsTest() {
        // Given
        Field field = new Field(new ArrayList<>());
        int expectedSize = 3;

        // When
        field.setCropRows(new ArrayList<>(Arrays.asList(new CropRow(null), new CropRow(null), new CropRow(null))));
        int actualSize = field.getCropRows().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void toStringTest() {
        // Given
        Field field = new Field(new ArrayList<>());
        String expectedToString = "\nField{cropRows=[]}";

        // When
        String actualToString = field.toString();

        // Then
        Assert.assertEquals(expectedToString, actualToString);
    }
}