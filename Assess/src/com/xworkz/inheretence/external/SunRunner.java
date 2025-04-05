package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.SunWithSolarFlare;
import sun.security.provider.Sun;

public class SunRunner {
        public static void main(String[] args) {
            Sun sun = new SunWithSolarFlare();
            sun.light();

            Sun basicSun = new Sun();
        }
    }
