package com.xworkz.Interface.internal;

    public class VLCPlayer implements MediaPlayer {
        @Override
        public void play() {
            System.out.println("Playing media using VLC Player.");
        }

        @Override
        public void pause() {
            System.out.println("Media paused in VLC Player.");
        }

        @Override
        public void stop() {
            System.out.println("Media stopped in VLC Player.");
        }
    }

