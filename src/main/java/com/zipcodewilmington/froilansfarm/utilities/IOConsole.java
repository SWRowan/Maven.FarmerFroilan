package com.zipcodewilmington.froilansfarm.utilities;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Author: Leon Hunter
 */
public final class IOConsole {
    private static IOConsole ioConsole;
    private Scanner input;
    private PrintStream output;

    private IOConsole() {
        this.input = new Scanner(System.in);
        this.output = System.out;
    }

    /**
     * For testing purposes only
     */
    public IOConsole(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
        ioConsole = this;
    }

    public static IOConsole getIOConsole() {
        if (ioConsole == null) {
            ioConsole = new IOConsole();
        }
        return ioConsole;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public String getLowerCaseStringInput(String prompt, Object... args) {
        return getStringInput(prompt, args).toLowerCase();
    }

    public void userPressEnterToContinue() {
        getStringInput("Press ENTER to continue");
    }

    public boolean yesOrNoQuestion(String prompt, Object... args) {
        String choice = getLowerCaseStringInput(prompt, args);
        while (!(choice.equals("yes") || choice.equals("no"))) {
            choice = getLowerCaseStringInput("Sorry, I couldn't understand you. Please enter 'yes' or 'no':");
        }
        return choice.equals("yes");
    }

    public Double getDoubleInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Double doubleInput = Double.parseDouble(stringInput);
            return doubleInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting a numeric value!");
            return getDoubleInput(prompt, args);
        }
    }

    public Long getLongInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Long longInput = Long.parseLong(stringInput);
            return longInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
            return getLongInput(prompt, args);
        }
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        return getLongInput(prompt, args).intValue();
    }
}


