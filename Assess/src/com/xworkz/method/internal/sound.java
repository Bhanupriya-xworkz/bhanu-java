package com.xworkz.method.internal;

    public class Music extends Sound {
        public Music() {
            System.out.println("Music instance created.");
        }

        @Override
        public void play() {
            System.out.println("Music is playing.");
        }

        @Override
        public void record() {
            System.out.println("Music is being recorded.");
        }

        @Override
        public void pause() {
            System.out.println("Music is paused.");
        }

        @Override
        public void stop() {
            System.out.println("Music is stopped.");
        }

        @Override
        public void mix() {
            System.out.println("Music is being mixed.");
        }

        public void album() {
            System.out.println("Album is being produced.");
        }
    }

