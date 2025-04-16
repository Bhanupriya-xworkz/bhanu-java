package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Bank;
import com.xworkz.Interface.internal.OnlineBanking;

    public class BankMain {
        public static void main(String[] args) {
            Bank bank1 = new OnlineBanking();
            bank1.login();
            bank1.transferMoney();
            bank1.logout();
        }
    }

