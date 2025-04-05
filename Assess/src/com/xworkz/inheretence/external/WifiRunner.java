package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.HighSpeedWiFi;
import com.xworkz.inheretence.internal.WiFi;

public class WiFiRunner {
        public static void main(String[] args) {
            WiFi wifi = new HighSpeedWiFi();  // Polymorphism: A HighSpeedWiFi object is treated as a WiFi
            wifi.speed();  // Calls the overridden method from HighSpeedWiFi

            WiFi basicWiFi = new WiFi();  // Creating an object of the base class WiFi
        }
    }

