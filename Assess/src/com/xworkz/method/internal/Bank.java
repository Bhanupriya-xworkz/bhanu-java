package com.xworkz.method.internal;

    public class Bank extends Account {

        public void loanService() {
            System.out.println("Bank provides loan services.");
        }

        public void Dbc(Account account) {
            account.open();
            account.deposit();
            account.withdraw();
            account.checkBalance();
            account.close();

            if (account instanceof Bank) {
                Bank bank = (Bank) account;
                System.out.println("Account is an instance of Bank.");
                bank.loanService();
            }
        }
    }

