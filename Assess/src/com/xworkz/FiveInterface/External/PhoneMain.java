package com.xworkz.FiveInterface.External;
import com.xworkz.FiveInterface.Internal.SmartPhone;

public class PhoneMain {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.powerOn();
        myPhone.makeCall("123-456-7890");
        myPhone.takePhoto();
        myPhone.playMusic("Shape of You");
        myPhone.browseInternet();
        myPhone.downloadApp("Instagram");
        myPhone.startNavigation("Central Park");
        myPhone.powerOff();
    }
}

