package com.xworkz.FiveInterface.External;
import com.xworkz.FiveInterface.Internal.SmartCharger;
import com.xworkz.FiveInterface.Internal.SmartCharger;

public class ChargerMain {
    public static void main(String[] args) {
        SmartCharger charger = new SmartCharger();
        charger.plugIn();
        charger.showChargingStatus();
        charger.enableFastCharge();
        charger.startWirelessCharging();
        charger.connectUSBTypeC();
        charger.activateOverchargeProtection();
        charger.connectToApp();
        charger.unplug();
    }
}

