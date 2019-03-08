package com.zipcodewilmington.froilansfarm.utilities;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOConsoleTest {
    ByteArrayInputStream bytArrInpStr;
    ByteArrayOutputStream bytArrOutStr;

    @Test
    public void getIOConsoleTest() {
        Assert.assertNotNull(IOConsole.getIOConsole());
    }

    @Test
    public void printTest() {
        // Given
        bytArrOutStr = new ByteArrayOutputStream();
        IOConsole ioConsole = getConsoleWithBufOut(bytArrOutStr);
        String expectedOutput = "hi";

        // When
        ioConsole.print("hi");
        String actualOutput = bytArrOutStr.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printlnTest() {
        // Given
        bytArrOutStr = new ByteArrayOutputStream();
        IOConsole ioConsole = getConsoleWithBufOut(bytArrOutStr);
        String expectedOutput = "hi\n";

        // When
        ioConsole.println("hi");
        String actualOutput = bytArrOutStr.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getStringInputTest() {
        // Given
        String expectedInput = "Hello";
        bytArrInpStr = new ByteArrayInputStream(expectedInput.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        String actualInput = ioConsole.getStringInput("");

        // Then
        Assert.assertEquals(expectedInput, actualInput);
    }

    @Test
    public void getLowerCaseStringInputTest() {
        // Given
        String input = "Hello";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);
        String expected = input.toLowerCase();


        // When
        String actual = ioConsole.getLowerCaseStringInput("");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void userPressEnterToContinueTest() {
        String input = "\nasdf";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);
        String expected = "asdf";

        // When
        ioConsole.userPressEnterToContinue();
        String actual = bytArrInpStr.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yesOrNoQuestion() {
    }

    @Test
    public void getDoubleInput() {
    }

    @Test
    public void getLongInput() {
    }

    @Test
    public void getIntegerInput() {
    }

    private IOConsole getConsoleWithBufInpOut(ByteArrayInputStream bais, ByteArrayOutputStream baos) {
        return new IOConsole(bais, new PrintStream(baos));
    }

    private IOConsole getConsoleWithBufOut(ByteArrayOutputStream baos) {
        return new IOConsole(System.in, new PrintStream(baos));
    }

    private IOConsole getConsoleWithBufInp(ByteArrayInputStream bais) {
        return new IOConsole(bais, System.out);
    }
}