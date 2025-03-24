package com.xworkz.accessSpecifier;

public class Meter {
    public double pi=3.14;
    boolean isClass=true;
    private int salary=100000;

    public void cheakAvailability(){
        System.out.println("Running cheakAvailability");
    }
    void cheakValidity(){
        System.out.println("Running cheakValidity");
    }
    private void destroy(){
        System.out.println("Running destroy");
    }
}
