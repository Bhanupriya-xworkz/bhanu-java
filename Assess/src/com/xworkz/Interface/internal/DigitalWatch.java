package com.xworkz.Interface.internal;
public class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("Time: 10:45 AM");
    }

    @Override
    public void showDate() {
        System.out.println("Date: April 16, 2025");
    }

    @Override
    public void showAlarm() {
        System.out.println("Alarm set for: 6:30 AM");
    }
}

