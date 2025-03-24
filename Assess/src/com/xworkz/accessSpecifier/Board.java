package com.xworkz.accessSpecifier;

public class Board {
    public static void main(strings[] args){
        Meter meter=new Meter();
        System.out.println(meter.pi);
        System.out.println(meter.isClass);
        System.out.println(meter.salary);
        meter.cheakAvailability()
                meter.cheakValidity();
        meter.destroy();
    }
}
