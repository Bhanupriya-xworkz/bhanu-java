package com.xworkz.Interface.internal;

    public interface PhonePayUser implements PhonePay {

        @Override
        public void sendMoney() {
            System.out.println("Sending ₹500 to Rahul via PhonePe.");
        }

        @Override
        public void checkBalance() {
            System.out.println("Current wallet balance: ₹1,200.");
        }

        @Override
        public void transactionHistory() {
            System.out.println("Recent Transactions:\n1. ₹300 to Zomato\n2. ₹150 from Paytm Wallet");
        }
    }

    @Override
    public void appTip() {
        System.out.println("PhonePay Tip: Enable two-factor authentication for better security.");
    }

