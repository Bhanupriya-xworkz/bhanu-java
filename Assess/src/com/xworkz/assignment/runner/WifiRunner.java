package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.veriable.Wifi;

public class WifiRunner {
        public static void main(String[] args) {
            Wifi w = new Wifi();
            System.out.println(w);
            System.out.println(new Wifi().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(w));

            Wifi wifi1 = new Wifi();
            wifi1.setConnected(true);
            Wifi wifi2 = new Wifi();
            wifi2.setConnected(false);
            boolean same = wifi1.equals(wifi2);
            System.out.println("both same: " + same);
        }
    }

