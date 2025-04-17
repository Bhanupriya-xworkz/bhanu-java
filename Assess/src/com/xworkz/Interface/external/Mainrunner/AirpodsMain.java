package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Airpods;
import com.xworkz.Interface.internal.AirpodsPro;

public class AirpodsMain {
        public static void main(String[] args) {
            Airpods airpods1 = new AirpodsPro();
            Airpods airpods2 = new AirpodsPro();
            Airpods airpods3 = new AirpodsPro();

            airpods1.connect();
            airpods2.playSound();
            airpods3.disconnect();
            myAirPods.batteryTips();
        }
    }

