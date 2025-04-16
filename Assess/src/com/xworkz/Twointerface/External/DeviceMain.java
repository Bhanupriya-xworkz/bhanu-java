package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Device;
import com.xworkz.Twointerface.Internal.Smartphone;

public class MainClass {
        public static void main(String[] args) {

            Device device1 = new Smartphone();
            Device device2 = new Laptop();

            device1.powerOn();
            device2.powerOff();

            Connectable connectable1 = new Smartphone();
            Connectable connectable2 = new Laptop();

            connectable1.connectToWifi();
            connectable2.disconnectWifi();
        }
    }

