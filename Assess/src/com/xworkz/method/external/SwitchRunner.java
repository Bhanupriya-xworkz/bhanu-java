package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Switch;
import com.xworkz.method.internal.SmartSwitch;

public class SwitchRunner {
        public static void main(String[] args) {
            Switch basicSwitch = new Switch();
            basicSwitch.turnOn();
            basicSwitch.turnOff();
            basicSwitch.displayStatus();

            System.out.println("=============");

            SmartSwitch smartSwitch = new SmartSwitch();
            smartSwitch.turnOn();
            smartSwitch.turnOff();
            smartSwitch.displayStatus();

            smartSwitch.scheduleTimer();
            smartSwitch.syncWithSmartHome();
            smartSwitch.monitorPowerUsage();
        }
    }
