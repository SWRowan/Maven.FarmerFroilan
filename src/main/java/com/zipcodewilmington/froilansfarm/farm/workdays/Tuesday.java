package com.zipcodewilmington.froilansfarm.farm.workdays;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public class Tuesday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Tuesday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
