package com.xworkz.Interface.internal;

    public class VideoGame implements Game {
        @Override
        public void start() {
            System.out.println("Starting the video game...");
        }

        @Override
        public void play() {
            System.out.println("Playing level 1: Adventure begins!");
        }

        @Override
        public void end() {
            System.out.println("Game over. Thanks for playing!");
        }
    }
    @Override
    public void gameTips() {
        System.out.println("Action Game Tip: Use your power-ups wisely and keep an eye on your health bar.");
    }

