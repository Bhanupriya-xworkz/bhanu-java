package com.xworkz.inheretence.internal;

    public class NightSky extends Sky {
        public void nightSkyInfo() {
            System.out.println("This is the night sky, visible after sunset.");
        }

        {
            super.weather();
            System.out.println("At night, the sky can be clear or filled with clouds.");
        }

        {
            super.clouds();
            System.out.println("Night skies may have different cloud formations and sometimes even thunderstorms.");
        }

        {
            super.sun();
            System.out.println("At night, the sun sets, and stars and the moon become visible.");
        }

        {
            super.dayAndNight();
            System.out.println("The transition from day to night in the sky is an amazing process.");
        }
    }

