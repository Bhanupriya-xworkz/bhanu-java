package com.xworkz.Interface.internal;

    public interface MediaPlayer {
        void play();
        void pause();
        void stop();

        default void mediaPlayerTip() {
            System.out.println("General Tip: Use playlists to organize your favorite media for quick access.");
        }
    }

