package com.xworkz.FiveInterface.Internal;

    abstract class Charger {
        abstract void plugIn();
        abstract void unplug();
        abstract void showChargingStatus();
    }

    interface FastCharging {
        void enableFastCharge();
    }

    interface WirelessCharging {
        void startWirelessCharging();
    }

    interface USBTypeC {
        void connectUSBTypeC();
    }

    interface BatteryProtection {
        void activateOverchargeProtection();
    }

    interface SmartControl {
        void connectToApp();
    }
