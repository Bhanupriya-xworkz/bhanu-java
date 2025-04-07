package com.xworkz.method.external;

import com.xworkz.method.internal.Airpods;
import com.xworkz.method.internal.WirelessAirpods;

    public class AirpodsRunner {
        public static void main(String[] args) {
            // Testing the Airpods class
            Airpods airpods1 = new Airpods();
            airpods1.pair();
            airpods1.playMusic();
            airpods1.pauseMusic();
            airpods1.charge();
            airpods1.adjustVolume();
            airpods1.activateSiri();

            System.out.println("=============");

            // Testing the WirelessAirpods class
            WirelessAirpods wirelessAirpods = new WirelessAirpods();
            wirelessAirpods.pair();
            wirelessAirpods.playMusic();
            wirelessAirpods.pauseMusic();
            wirelessAirpods.charge();
            wirelessAirpods.adjustVolume();
            wirelessAirpods.activateSiri();
        }
    }

