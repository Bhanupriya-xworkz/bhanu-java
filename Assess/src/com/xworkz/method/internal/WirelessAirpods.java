package com.xworkz.method.internal;

    public class WirelessAirpods extends Airpods {

        public WirelessAirpods() {
            System.out.println("Wireless Airpods are created...");
        }

        @Override
        public void pair() {
            System.out.println("Wireless Airpods are pairing wirelessly...");
        }

        @Override
        public void playMusic() {
            System.out.println("Wireless Airpods are playing music in stereo...");
        }

        @Override
        public void pauseMusic() {
            System.out.println("Music has been paused on Wireless Airpods...");
        }

        @Override
        public void charge() {
            System.out.println("Wireless Airpods are charging wirelessly...");
        }

        @Override
        public void adjustVolume() {
            System.out.println("Volume is being adjusted via touch controls on Wireless Airpods...");
        }

        @Override
        public void activateSiri() {
            System.out.println("Siri is activated through Wireless Airpods with voice command...");
        }
    }

