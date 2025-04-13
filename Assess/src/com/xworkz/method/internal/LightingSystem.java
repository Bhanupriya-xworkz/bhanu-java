package com.xworkz.method.internal;

    public class LightingSystem extends Light {

        public void autoAdjust() {
            System.out.println("LightingSystem auto-adjusts brightness based on ambient light.");
        }

        public void Dbc(Light light) {
            light.turnOn();
            light.turnOff();
            light.dim();
            light.brighten();
            light.blink();

            if (light instanceof LightingSystem) {
                LightingSystem system = (LightingSystem) light;
                System.out.println("Light is an instance of LightingSystem.");
                system.autoAdjust();
            }
        }
    }

