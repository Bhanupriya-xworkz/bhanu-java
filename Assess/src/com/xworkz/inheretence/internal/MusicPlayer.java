package com.xworkz.inheretence.internal;

public class MusicPlayer {

        private String brand;
        private int volumeLevel;

        public MusicPlayer(String brand) {
            this.brand = brand;
            this.volumeLevel = 10;  // Default volume level
            System.out.println("No-args constructor of MusicPlayer");
        }

        public void playMusic() {
            System.out.println("Playing music...");
        }

        public void stopMusic() {
            System.out.println("Stopping music...");
        }

        public void adjustVolume(int level) {
            this.volumeLevel = level;
            System.out.println("Adjusting volume to level " + volumeLevel);
        }

        public void displayInfo() {
            System.out.println("Music Player Brand: " + brand);
            System.out.println("Current Volume Level: " + volumeLevel);
        }
}
