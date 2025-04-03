package com.xworkz.inheretence.internal;

    public class DigitalDoll extends Doll {

        public DigitalDoll() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalDoll constructor");
        }

        @Override
        public void dressUp() {
            super.dressUp();
            System.out.println("Dressing up the digital doll using a virtual wardrobe...");
        }

        @Override
        public void playWith() {
            super.playWith();
            System.out.println("Playing with the digital doll using interactive features...");
        }

        @Override
        public void storeDoll() {
            super.storeDoll();
            System.out.println("Storing the digital doll in the app or device...");
        }

        @Override
        public void cleanDoll() {
            super.cleanDoll();
            System.out.println("Cleaning the digital doll in the virtual world...");
        }

        @Override
        public void displayDoll() {
            super.displayDoll();
            System.out.println("Displaying the digital doll on the screen...");
        }

        public void interactWithVoice() {
            System.out.println("Interacting with the digital doll using voice commands...");
        }

        public void customizeAppearance() {
            System.out.println("Customizing the appearance of the digital doll with different outfits and accessories...");
        }
    }
