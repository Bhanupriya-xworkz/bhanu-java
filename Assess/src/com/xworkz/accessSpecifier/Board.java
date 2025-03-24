package com.xworkz.accessSpecifier;

public class Board {

    public static void main(String[] args){
        Meter meter = new Meter();
        System.out.println(meter.pi);
        System.out.println(meter.isClass);
           system.out.println(meter.salary);
        meter.checkAvailability();
        meter.checkValidity();
         meter.destroy();
    }

}
