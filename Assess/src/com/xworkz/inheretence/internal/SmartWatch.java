package com.xworkz.inheretence.internal;

    public class SmartWatch extends Watch {

        public SmartWatch() {
            super();  // Calling the parent class constructor
            System.out.println("SmartWatch constructor");
        }

        @Override
        public void displayTime() {
            super.displayTime();
            System.out.println("Displaying time on the smart watch with additional features...");
        }

        @Override
        public void setAlarm() {
            super.setAlarm();
            System.out.println("Setting a smart alarm with vibration and notifications...");
        }

        @Override
        public void adjustTime() {
            super.adjustTime();
            System.out.println("Adjusting the time on the smart watch using the touch screen...");
        }

        @Override
        public void changeBand() {
            super.changeBand();
            System.out.println("Changing the smart watch band for a personalized look...");
        }

        @Override
        public void displayDate() {
            super.displayDate();
            System.out.println("Displaying the date on the smart watch with reminders...");
        }

        public void trackFitness() {
            System.out.println("Tracking fitness and steps using the smart watch...");
        }

        public void receiveNotifications() {
            System.out.println("Receiving notifications for messages, calls, and apps on the smart watch...");
        }

        public void monitorHeartRate() {
            System.out.println("Monitoring heart rate using the smart watch's sensor...");
        }
    }
