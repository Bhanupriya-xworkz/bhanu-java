package com.xworkz.FiveInterface.Internal;

    abstract class Keyboard {
        abstract void connect();
        abstract void type();
        abstract void disconnect();
    }

    interface BacklightControl {
        void enableBacklight();
    }

    interface WirelessConnection {
        void pairViaBluetooth();
    }

    interface MacroSupport {
        void programMacroKeys();
    }

    interface BatteryStatus {
        void checkBatteryLevel();
    }

    interface RGBLighting {
        void changeRGBColor(String color);
    }
