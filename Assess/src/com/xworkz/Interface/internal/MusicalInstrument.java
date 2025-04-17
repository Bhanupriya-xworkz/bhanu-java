package com.xworkz.Interface.internal;

    public interface MusicalInstrument {
        void play();
        void tune();
        void stop();

        default void instrumentCareTip() {
            System.out.println("General Tip: Store your instrument in a dry place and clean it regularly.");
        }
    }

