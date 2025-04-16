package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.ElectricPower;
import com.xworkz.Interface.internal.Power;

public class PowerMain{
        public static void main(String[] args) {

            Power power1 = new ElectricPower();
            Power power2 = new ElectricPower();
            Power power3 = new ElectricPower();

            power1.turnOn();
            power2.getPowerSource();
            power3.turnOff();
        }
    }

