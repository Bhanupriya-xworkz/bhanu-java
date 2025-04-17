package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.LEDDisplay;
import com.xworkz.Interface.internal.Screen;

public class ScreenMain {
    public static void main(String[] args) {

        Screen screen1 = new LEDDisplay();
        Screen screen2 = new LEDDisplay();
        Screen screen3 = new LEDDisplay();

        screen1.turnOn();
        screen2.displayResolution();
        screen3.turnOff();

        screen.screenTip();
    }
}

