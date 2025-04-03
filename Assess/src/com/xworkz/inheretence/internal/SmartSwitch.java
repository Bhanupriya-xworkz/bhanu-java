package com.xworkz.inheretence.internal;

    public class NintendoSwitch extends Switch {

        public NintendoSwitch() {
            super();
            System.out.println("NintendoSwitch constructor");
        }

        public void startGame() {
            super.startGame();
            System.out.println("Starting the game on Nintendo Switch...");
        }

        public void checkBattery() {
            super.checkBattery();
            System.out.println("Checking the Nintendo Switch battery...");
        }

        public void updateSoftware() {
            super.updateSoftware();
            System.out.println("Updating Nintendo Switch software...");
        }

        public void connectController() {
            super.connectController();
            System.out.println("Connecting Joy-Con or Pro Controller to Nintendo Switch...");
        }

        public void enableSleepMode() {
            super.enableSleepMode();
            System.out.println("Enabling sleep mode with Nintendo Switch...");
        }

        public void enableDockingMode() {
            System.out.println("Switching to TV mode by docking Nintendo Switch...");
        }

        public void enableHandheldMode() {
            System.out.println("Switching to handheld mode on Nintendo Switch...");
        }

        public void playMultiplayer() {
            System.out.println("Starting a multiplayer game on Nintendo Switch...");
        }
    }
