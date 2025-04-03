package com.xworkz.inheretence.internal;

    public class DigitalPaper extends Paper {

        public DigitalPaper() {
            super();
            System.out.println("DigitalPaper constructor");
        }

        public void checkSize() {
            super.checkSize();
            System.out.println("Checking the size of the DigitalPaper...");
        }

        public void checkQuality() {
            super.checkQuality();
            System.out.println("Checking the quality of the DigitalPaper...");
        }

        public void printOnPaper() {
            super.printOnPaper();
            System.out.println("Printing on the DigitalPaper...");
        }

        public void foldPaper() {
            super.foldPaper();
            System.out.println("Folding the DigitalPaper...");
        }

        public void storePaper() {
            super.storePaper();
            System.out.println("Storing the DigitalPaper in a cloud storage...");
        }

        public void shareDigitally() {
            System.out.println("Sharing the DigitalPaper with others...");
        }

        public void addAnnotations() {
            System.out.println("Adding annotations to the DigitalPaper...");
        }

        public void deleteContent() {
            System.out.println("Deleting content from the DigitalPaper...");
        }
    }
