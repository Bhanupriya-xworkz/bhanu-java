package com.xworkz.Interface.internal;

public interface TaxiService {
    void bookRide(String pickup, String drop);
    void trackRide();
    void cancelRide();

    default void taxiTip() {
        System.out.println("General Tip: Confirm driver details before starting the ride.");
    }
}
