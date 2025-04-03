package com.xworkz.inheretence.internal;

    public class EBook extends Book {

        public EBook() {
            super();  // Calling the parent class constructor
            System.out.println("EBook constructor");
        }

        public void checkPages() {
            super.checkPages();
            System.out.println("Checking the number of pages in the EBook...");
        }

        public void checkAuthor() {
            super.checkAuthor();
            System.out.println("Checking the author of the EBook...");
        }

        public void readBook() {
            super.readBook();
            System.out.println("Reading the EBook on a device...");
        }

        public void openBook() {
            super.openBook();
            System.out.println("Opening the EBook on the screen...");
        }

        public void checkPublisher() {
            super.checkPublisher();
            System.out.println("Checking the publisher of the EBook...");
        }
    }

