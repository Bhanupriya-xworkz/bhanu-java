package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.HeavyRain;
import com.xworkz.inheretence.internal.Rain;

public class RainRunner {
        public static void main(String[] args) {
            Rain rain = new HeavyRain();  // Polymorphism: A HeavyRain object is treated as a Rain
            rain.rainTypes();  // Calls the overridden method from HeavyRain

            Rain basicRain = new Rain();  // Creating an object of the base class Rain
        }
    }

