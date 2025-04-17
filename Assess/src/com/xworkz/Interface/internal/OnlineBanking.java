package com.xworkz.Interface.internal;

    public class OnlineBanking implements Bank {
        @Override
        public void login() {
            System.out.println("OnlineBanking executing: login");
        }

        @Override
        public void transferMoney() {
            System.out.println("OnlineBanking executing: transferMoney");
        }

        @Override
        public void logout() {
            System.out.println("OnlineBanking executing: logout");
        }
    }
    @Override
    public void customerSupport() {
        System.out.println("HDFC Bank Support: Call 1800-202-6161 or visit your nearest branch.");

    }

