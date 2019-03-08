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
        String input = "\nasdf\n";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);
        String expected = "asdf";

        // When
        ioConsole.userPressEnterToContinue();
        String actual = ioConsole.getStringInput("");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void yesOrNoQuestionTest1() {
        // Given
        String input = "yes\n";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        boolean userInput = ioConsole.yesOrNoQuestion("");

        // Then
        Assert.assertTrue(userInput);
    }

    @Test
    public void yesOrNoQuestionTest2() {
        // Given
        String input = "no\n";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        boolean userInput = ioConsole.yesOrNoQuestion("");

        // Then
        Assert.assertFalse(userInput);
    }

    @Test
    public void yesOrNoQuestionTest3() {
        // Given
        String input = "badinput\nno\n";
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        boolean userInput = ioConsole.yesOrNoQuestion("");

        // Then
        Assert.assertFalse(userInput);
    }

    @Test
    public void getDoubleInputTest() {
        // Given
        String input = "5\n";
        double expectedDouble = 5.0;
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        double actualDouble = ioConsole.getDoubleInput("");

        // Then
        Assert.assertEquals(expectedDouble, actualDouble, .000001);
    }

    @Test
    public void getLongInputTest() {
        // Given
        String input = "8\n";
        long expectedLong = 8;
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        long actualLong = ioConsole.getLongInput("");

        // Then
        Assert.assertEquals(expectedLong, actualLong);
    }

    @Test
    public void getIntegerInputTest() {
        // Given
        String input = "11\n";
        int expectedInteger = 11;
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        int actualInteger = ioConsole.getIntegerInput("");

        // Then
        Assert.assertEquals(expectedInteger, actualInteger);
    }

    @Test
    public void getDoubleInputTest2() {
        // Given
        String input = "dsaf\n5\n";
        double expectedDouble = 5.0;
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        double actualDouble = ioConsole.getDoubleInput("");

        // Then
        Assert.assertEquals(expectedDouble, actualDouble, .000001);
    }

    @Test
    public void getLongInputTest2() {
        // Given
        String input = "fdsa\n8\n";
        long expectedLong = 8;
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        long actualLong = ioConsole.getLongInput("");

        // Then
        Assert.assertEquals(expectedLong, actualLong);
    }

    @Test
    public void getIntegerInputTest2() {
        // Given
        String input = "asdf\n11\n";
        int expectedInteger = 11;
        bytArrInpStr = new ByteArrayInputStream(input.getBytes());
        IOConsole ioConsole = getConsoleWithBufInp(bytArrInpStr);

        // When
        int actualInteger = ioConsole.getIntegerInput("");

        // Then
        Assert.assertEquals(expectedInteger, actualInteger);
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