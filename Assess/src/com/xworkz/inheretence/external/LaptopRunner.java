package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Laptop;
import com.xworkz.inheretence.internal.MacBook;

public class LaptopRunner {
    public class LaptopRunner {
        public static void main(String[] args) {

            Laptop laptop = new MacBook();

            Laptop basicLaptop = new Laptop();

            laptop.startLaptop();
            laptop.checkBattery();
            laptop.updateSoftware();
            laptop.connectToWiFi();
            laptop.turnOff();
            ((MacBook) laptop).enableTouchBar();
            ((MacBook) laptop).enableSiri();
            ((MacBook) laptop).enableMacOSFeatures();

            basicLaptop.startLaptop();
            basicLaptop.checkBattery();
            basicLaptop.updateSoftware();
        }
    }


