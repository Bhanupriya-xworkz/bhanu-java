package com.xworkz.FiveInterface.External;
import com.xworkz.FiveInterface.Internal.SmartKeyboard;

public class KeyboardMain {
    public static void main(String[] args) {
        SmartKeyboard kb = new SmartKeyboard();
        kb.connect();
        kb.pairViaBluetooth();
        kb.enableBacklight();
        kb.changeRGBColor("blue");
        kb.programMacroKeys();
        kb.checkBatteryLevel();
        kb.type();
        kb.disconnect();
    }
}

