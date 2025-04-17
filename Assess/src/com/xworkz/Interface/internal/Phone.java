package com.xworkz.Interface.internal;

public interface Phone {
    void makeCall();
    void sendMessage();
    void browseInternet();

    default void phoneTip() {
        System.out.println("General Tip: Keep your phone's software updated for better security.");
    }
}
