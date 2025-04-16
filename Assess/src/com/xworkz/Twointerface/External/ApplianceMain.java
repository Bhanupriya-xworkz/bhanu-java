package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Appliance;
import com.xworkz.Twointerface.Internal.WashingMachine;

public class ApplianceMain {
        public static void main(String[] args) {
            Appliance appliance1 = new WashingMachine();
            Appliance appliance2 = new Microwave();

            appliance1.turnOn();
            appliance2.turnOff();

            Power power1 = new WashingMachine();
            Power power2 = new Microwave();

            power1.voltage();
            power2.powerRating();
        }
    }

