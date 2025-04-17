package com.xworkz.FiveInterface.Internal;

    abstract class Phone {
        abstract void powerOn();
        abstract void makeCall(String number);
        abstract void powerOff();
    }

    interface CameraFeature {
        void takePhoto();
    }

    interface InternetAccess {
        void browseInternet();
    }

    interface GPSNavigation {
        void startNavigation(String location);
    }

    interface MediaPlayer {
        void playMusic(String song);
    }

    interface AppStore {
        void downloadApp(String appName);
    }

