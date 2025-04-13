package com.xworkz.method.external;

import com.xworkz.method.internal.Bank;
import com.xworkz.method.internal.SavingsAccount;

public class AccountRunner {
        public static void main(String[] args) {

            System.out.println("Using SavingsAccount object:");
            SavingsAccount savings = new SavingsAccount();
            savings.open();
            savings.deposit();
            savings.withdraw();
            savings.checkBalance();
            savings.close();
            savings.applyInterest();

            System.out.println("=====================");

            Account account = new Account();
            account.open();
            account.deposit();
            account.withdraw();
            account.checkBalance();
            account.close();

            System.out.println("=====================");

            Bank bank = new Bank();
            bank.Dbc(account);
            bank.Dbc(bank);
        }
    }

