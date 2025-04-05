package com.xworkz.inheretence.internal;

    public class HighSpeedWiFi extends WiFi {
        public void highSpeedInfo() {
            System.out.println("This is high-speed WiFi offering faster internet speeds.");
        }

        {
            super.speed();
            System.out.println("High-speed WiFi offers gigabit-level internet speeds.");
        }

        {
            super.range();
            System.out.println("High-speed WiFi has an enhanced range compared to standard WiFi.");
        }

        {
            super.security();
            System.out.println("High-speed WiFi supports advanced security protocols like WPA3.");
        }

        {
            super.connection();
            System.out.println("High-speed WiFi supports more simultaneous device connections without slowing down.");
        }
    }

