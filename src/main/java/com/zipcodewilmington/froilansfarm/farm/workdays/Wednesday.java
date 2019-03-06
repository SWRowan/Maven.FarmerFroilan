package com.zipcodewilmington.froilansfarm.farm.workdays;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public class Wednesday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Wednesday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
