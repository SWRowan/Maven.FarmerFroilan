package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.interfaces.FarmSimulation;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public abstract class WorkDay implements FarmSimulation {
    protected void println(String val, Object... args) {
        IOConsole.getIOConsole().println(val, args);
    }

    protected void userPressEnterToContinue() {
        IOConsole.getIOConsole().userPressEnterToContinue();
    }
}
