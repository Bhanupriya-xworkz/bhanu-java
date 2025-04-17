package com.xworkz.Interface.internal;
public interface Tower {
    void transmitSignal();
    void receiveSignal();
    void towerStatus();

    @Override
    public void ticketTip() {
        System.out.println("Ticket Tip: Book early to get the best seats at lower prices.");
    }
}

