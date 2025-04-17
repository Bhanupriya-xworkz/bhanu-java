package com.xworkz.FiveInterface.Internal;
    public class SmartPhone extends Phone
            implements CameraFeature, InternetAccess, GPSNavigation, MediaPlayer, AppStore {

        @Override
        void powerOn() {
            System.out.println("Phone is powering on...");
        }

        @Override
        void makeCall(String number) {
            System.out.println("Calling " + number + "...");
        }

        @Override
        void powerOff() {
            System.out.println("Phone is shutting down.");
        }

        @Override
        public void takePhoto() {
            System.out.println("Photo taken with 108MP camera.");
        }

        @Override
        public void browseInternet() {
            System.out.println("Browsing internet using 5G.");
        }

        @Override
        public void startNavigation(String location) {
            System.out.println("Starting navigation to " + location + "...");
        }

        @Override
        public void playMusic(String song) {
            System.out.println("Now playing: " + song);
        }

        @Override
        public void downloadApp(String appName) {
            System.out.println("Downloading app: " + appName);
        }
}
