package com.xworkz.inheretence.internal;

    public class HeavyRain extends Rain {
        public void heavyRainInfo() {
            System.out.println("This is heavy rain, characterized by intense rainfall over a short period.");
        }

        {
            super.rainTypes();
            System.out.println("Heavy rain is associated with thunderstorms and can cause flooding.");
        }

        {
            super.rainEffect();
            System.out.println("Heavy rain significantly impacts the environment, causing flash floods and soil erosion.");
        }

        {
            super.rainDuration();
            System.out.println("Heavy rain typically lasts for a short time but can be extremely intense.");
        }

        {
            super.rainImpactOnWeather();
            System.out.println("Heavy rain often results in dramatic weather changes, such as cooler temperatures and high humidity.");
        }
    }

