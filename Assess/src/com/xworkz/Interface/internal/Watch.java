package com.xworkz.Interface.internal;

public interface Watch {
    void showTime();
    void showDate();
    void showAlarm();

    default void watchCareTip() {
        System.out.println("General Tip: Keep your watch away from magnets and moisture for better longevity.");
    }
}

