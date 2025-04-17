package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Internet;
import com.xworkz.Interface.internal.WifiConnection;

public class InternetMain {
        public static void main(String[] args) {
            Internet net1 = new WifiConnection();
            Internet net2 = new WifiConnection();
            Internet net3 = new WifiConnection();

            net1.connect();
            net2.showSpeed();
            net3.disconnect();
            Internet.internetSafetyTips();
        }
    }

