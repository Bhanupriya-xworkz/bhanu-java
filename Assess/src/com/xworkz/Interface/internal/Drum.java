package com.xworkz.Interface.internal;

    public class Drum implements MusicalInstrument {

        @Override
        public void play() {
            System.out.println("Beating the drums!");
        }

        @Override
        public void tune() {
            System.out.println("Tightening the drum heads.");
        }

        @Override
        public void stop() {
            System.out.println("Drumming stopped.");
        }
    }

