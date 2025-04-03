package com.xworkz.inheretence.internal;

    public class DigitalGame extends Game {

        public DigitalGame() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalGame constructor");
        }

        public void startGame() {
            super.startGame();
            System.out.println("Starting the Digital Game on the gaming platform...");
        }

        public void playGame() {
            super.playGame();
            System.out.println("Playing the Digital Game on the console or PC...");
        }

        public void checkDifficultyLevel() {
            super.checkDifficultyLevel();
            System.out.println("Adjusting the difficulty level in the Digital Game...");
        }

        public void saveProgress() {
            super.saveProgress();
            System.out.println("Saving the progress of the Digital Game to the cloud...");
        }

        public void endGame() {
            super.endGame();
            System.out.println("Ending the Digital Game session and saving progress...");
        }
    }
