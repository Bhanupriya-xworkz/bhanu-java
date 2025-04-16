package com.xworkz.Twointerface.Internal;

    public interface Device {
        void powerOn();
        void powerOff();
    }

public interface Connectable {
    void connectToWifi();
    void disconnectWifi();
}

