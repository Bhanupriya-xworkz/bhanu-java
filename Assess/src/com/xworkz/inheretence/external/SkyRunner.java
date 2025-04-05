package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.NightSky;
import com.xworkz.inheretence.internal.Sky;

public class SkyRunner {
        public static void main(String[] args) {
            Sky sky = new NightSky();
            sky.weather();

            Sky basicSky = new Sky();
        }
    }

