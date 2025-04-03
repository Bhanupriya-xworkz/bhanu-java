package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Airpods;
import com.xworkz.inheretence.internal.AirPods;

public class AirpodsRunner {
        public static void main(String[] args) {

            AirPods smartAirPods = new SmartAirPods();

            AirPods basicAirPods = new AirPods();

            smartAirPods.playMusic();
            smartAirPods.pauseMusic();
            smartAirPods.activateNoiseCancellation();
            smartAirPods.trackBattery();
            smartAirPods.useSiri();
            smartAirPods.enableTransparencyMode();

            basicAirPods.playMusic();
            basicAirPods.adjustVolume();
        }
    }
