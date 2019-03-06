package com.zipcodewilmington.froilansfarm.farm.workdays;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public class Thursday extends WorkDay {
    public void run(Farm farm) {
        farm.ioConsole.println("Thursday has happened!");
        farm.ioConsole.getStringInput("Press ENTER to continue");
    }
}
