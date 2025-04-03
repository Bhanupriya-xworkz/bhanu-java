package com.xworkz.inheretence.internal;

    public class DigitalAlbum extends Album {

        public DigitalAlbum() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalAlbum constructor");
        }

        public void addPhoto() {
            super.addPhoto();
            System.out.println("Uploading a photo to the digital album...");
        }

        public void removePhoto() {
            super.removePhoto();
            System.out.println("Removing a photo from the digital album...");
        }

        public void viewPhotos() {
            super.viewPhotos();
            System.out.println("Viewing photos in the digital album on a device...");
        }

        public void organizeAlbum() {
            super.organizeAlbum();
            System.out.println("Organizing photos in the digital album (using tags, folders, etc.)...");
        }

        public void printAlbum() {
            super.printAlbum();
            System.out.println("Printing the digital album or exporting it as a PDF...");
        }

        public void shareAlbum() {
            System.out.println("Sharing the digital album with others via a link or email...");
        }

        public void createSlideshow() {
            System.out.println("Creating a slideshow of photos in the digital album...");
        }
    }

