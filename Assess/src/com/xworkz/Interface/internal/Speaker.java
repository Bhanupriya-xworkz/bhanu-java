package com.xworkz.Interface.internal;

    public interface Speaker {
        void connect();
        void playMusic();
        void disconnect();

        default void soundTip() {
            System.out.println("General Tip: Place the speaker in an open space for better sound quality.");
        }
    }

