package com.xworkz.Interface.internal;

    public interface Game {
        void start();
        void play();
        void end();

        default void gameTips() {
            System.out.println("General Tip: Remember to take breaks during intense gaming sessions!");
        }
    }

