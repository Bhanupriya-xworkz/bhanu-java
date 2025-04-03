package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Bank;
import com.xworkz.inheretence.internal.DigitalBank;

public class BankRunner {
    public static void main(String[] args) {
        // Creating an instance of DigitalBank using Bank reference
        Bank digitalBank = new DigitalBank();

        // Creating an instance of Bank
        Bank traditionalBank = new Bank();
    }
}

