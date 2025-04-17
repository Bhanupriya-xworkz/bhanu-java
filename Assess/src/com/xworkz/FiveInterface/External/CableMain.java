package com.xworkz.FiveInterface.External;
import com.xworkz.FiveInterface.Internal.SmartCable;

public class CableMain {
    public static void main(String[] args) {
        SmartCable cable = new SmartCable();
        cable.connectDevice();
        cable.transferData();
        cable.enableFastTransfer();
        cable.supportPowerDelivery();
        cable.showBraidedStrength();
        cable.attachMagnetically();
        cable.checkCompatibility();
        cable.disconnectDevice();
    }
}

