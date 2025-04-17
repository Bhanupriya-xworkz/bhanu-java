package com.xworkz.Interface.internal;
public interface Beer {

    void pour();
    void drink();
    void getAlcoholContent();
    default void drinkResponsiblyMessage() {
        System.out.println("General Tip: Drink responsibly. Do not drink and drive.");
    }
}

