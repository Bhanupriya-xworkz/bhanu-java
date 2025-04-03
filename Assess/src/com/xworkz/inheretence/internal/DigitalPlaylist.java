package com.xworkz.inheretence.internal;

    public class DigitalPlaylist extends Playlist {

        public DigitalPlaylist() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalPlaylist constructor");
        }

        public void addSong() {
            super.addSong();
            System.out.println("Adding a song to the digital playlist (from online platforms)...");
        }

        public void removeSong() {
            super.removeSong();
            System.out.println("Removing a song from the digital playlist (online platforms)...");
        }

        public void playPlaylist() {
            super.playPlaylist();
            System.out.println("Playing the playlist on a digital device or app...");
        }

        public void shufflePlaylist() {
            super.shufflePlaylist();
            System.out.println("Shuffling the digital playlist randomly...");
        }

        public void displayPlaylist() {
            super.displayPlaylist();
            System.out.println("Displaying the digital playlist on the app or website...");
        }
    }
