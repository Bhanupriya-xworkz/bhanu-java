package com.xworkz.Interface.internal;

    public interface Musicplayer {
        void play();
        void pause();
        void stop();

        default void playerTip() {
            System.out.println("General Tip: Create playlists to organize your favorite songs easily.");
        }
    }

