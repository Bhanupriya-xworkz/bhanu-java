package com.xworkz.inheretence.internal;

    public class SunWithSolarFlare extends Sun {
        public void solarFlareInfo() {
            System.out.println("This is a sun with solar flares, which are intense bursts of energy.");
        }

        {
            super.light();
            System.out.println("During solar flares, the Sun emits even more intense light and radiation.");
        }

        {
            super.energy();
            System.out.println("Solar flares release huge amounts of energy in the form of X-rays and UV rays.");
        }

        {
            super.distance();
            System.out.println("Solar flares can affect the space weather near Earth, potentially disrupting communications.");
        }

        {
            super.solarSystem();
            System.out.println("Solar flares can impact the planets and objects in the solar system.");
        }
    }

