package com.xworkz.inheretence.external;

public class ChargerRunner {
        public static void main(String[] args) {

            Charger charger = new SmartCharger();

            Charger basicCharger = new Charger();

            charger.checkPower();
            charger.checkCompatibility();
            charger.plugIn();
            charger.unplug();
            charger.chargeDevice();
            ((SmartCharger) charger).fastCharge();
            ((SmartCharger) charger).monitorCharging();
            ((SmartCharger) charger).controlTemperature();
            ((SmartCharger) charger).sendNotification();

            basicCharger.checkPower();
            basicCharger.checkCompatibility();
            basicCharger.plugIn();
        }
    }
