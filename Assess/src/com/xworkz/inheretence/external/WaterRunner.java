package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.FreshWater;
import com.xworkz.inheretence.internal.Water;

public class WaterRunner {
        public static void main(String[] args) {
            Water water = new FreshWater();
            water.types();

            Water basicWater = new Water();
        }
    }

