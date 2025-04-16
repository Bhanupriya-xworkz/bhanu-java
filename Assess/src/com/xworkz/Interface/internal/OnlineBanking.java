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

