package com.xworkz.Interface.internal;

public class CreditCard implements Payment {

    @Override
    public void Initiate() {
        System.out.println("Initiate");
    }

    @Override
    public void Process() {
        System.out.println("Process");
    }

    @Override
    public void Confirm() {
        System.out.println("Confirm");
    }
}

@Override
public void paymentTip() {
    System.out.println("UPI Tip: Use QR codes from trusted sources only.");
}


