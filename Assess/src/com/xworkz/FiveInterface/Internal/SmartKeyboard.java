package com.xworkz.FiveInterface.Internal;

    public class SmartKeyboard extends Keyboard
            implements BacklightControl, WirelessConnection, MacroSupport, BatteryStatus, RGBLighting {

        @Override
        void connect() {
            System.out.println("Keyboard connected to device.");
        }

        @Override
        void type() {
            System.out.println("Typing on the keyboard...");
        }

        @Override
        void disconnect() {
            System.out.println("Keyboard disconnected.");
        }

        // Implement methods from interfaces
        @Override
        public void enableBacklight() {
            System.out.println("Backlight turned on.");
        }

        @Override
        public void pairViaBluetooth() {
            System.out.println("Keyboard paired via Bluetooth.");
        }

        @Override
        public void programMacroKeys() {
            System.out.println("Macro keys programmed.");
        }

        @Override
        public void checkBatteryLevel() {
            System.out.println("Battery level: 85%");
        }

        @Override
        public void changeRGBColor(String color) {
            System.out.println("RGB color changed to " + color);
        }
}
