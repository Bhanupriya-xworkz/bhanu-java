package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Fan;
import com.xworkz.Interface.internal.CeilingFan;

    public class FanMain {
        public static void main(String[] args) {
            Fan fan1 = new CeilingFan();
            fan1.turnOn();
            fan1.rotate();
            fan1.turnOff();
            Fan.maintenanceTips();
        }
    }

