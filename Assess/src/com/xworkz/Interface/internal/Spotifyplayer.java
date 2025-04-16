package com.xworkz.Interface.internal;

    public class Spotifyplayer implements Musicplayer {

        @Override
        public void play() {
            System.out.println("Playing: 'Blinding Lights' by The Weeknd on Spotify.");
        }

        @Override
        public void pause() {
            System.out.println("Music paused.");
        }

        @Override
        public void stop() {
            System.out.println("Playback stopped. Thanks for listening!");
        }
    }

