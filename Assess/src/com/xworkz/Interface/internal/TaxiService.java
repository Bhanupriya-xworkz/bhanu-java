package com.xworkz.Interface.internal;

public interface TaxiService {
    void bookRide(String pickup, String drop);
    void trackRide();
    void cancelRide();
}
