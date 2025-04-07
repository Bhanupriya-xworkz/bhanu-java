package com.xworkz.method.external;

import com.xworkz.method.internal.Charger;
import com.xworkz.method.internal.SmartCharger;

    public class ChargerRunner {
        public static void main(String[] args) {

            Charger charger = new Charger();
            charger.plugIn();
            charger.charge();
            charger.displayStatus();
            charger.stopCharging();
            charger.plugOut();

            System.out.println("=============");

            SmartCharger smartCharger = new SmartCharger();
            smartCharger.plugIn();
            smartCharger.charge();
            smartCharger.displayStatus();
            smartCharger.stopCharging();
            smartCharger.plugOut();

            // SmartCharger specific methods
            smartCharger.monitorBattery();
            smartCharger.adjustChargingSpeed();
        }
    }
