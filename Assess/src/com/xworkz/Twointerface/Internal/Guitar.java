package com.xworkz.Twointerface.Internal;

    public class Guitar implements Instrument, Sound {

        @Override
        public void play() {
            System.out.println("Guitar is being played.");
        }

        @Override
        public void tune() {
            System.out.println("Guitar is tuned to standard E.");
        }

        @Override
        public void volumeLevel() {
            System.out.println("Guitar volume: Medium");
        }

        @Override
        public void soundType() {
            System.out.println("Guitar sound: Melodic");
        }
    }

public class Drum implements Instrument, Sound {

    @Override
    public void play() {
        System.out.println("Drum is being played.");
    }

    @Override
    public void tune() {
        System.out.println("Drum is tuned with tension rods.");
    }

    @Override
    public void volumeLevel() {
        System.out.println("Drum volume: High");
    }

    @Override
    public void soundType() {
        System.out.println("Drum sound: Percussive");
    }
}

