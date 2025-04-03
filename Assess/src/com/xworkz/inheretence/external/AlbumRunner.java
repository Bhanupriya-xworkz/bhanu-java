package com.xworkz.inheretence.external;

    public class AlbumRunner {
        public static void main(String[] args) {

            Album digitalAlbum = new DigitalAlbum();

            // Creating an instance of Album
            Album traditionalAlbum = new Album();

            digitalAlbum.addPhoto();
            digitalAlbum.viewPhotos();
            digitalAlbum.createSlideshow();
            digitalAlbum.shareAlbum();

            traditionalAlbum.addPhoto();
            traditionalAlbum.viewPhotos();
        }
    }
