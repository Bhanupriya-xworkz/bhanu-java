package com.xworkz.inheretence.internal;

    public class DigitalCalendar extends Calendar {

        public DigitalCalendar() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalCalendar constructor");
        }

        public void addEvent() {
            super.addEvent();
            System.out.println("Adding a new event to the digital calendar (using an app or software)...");
        }

        public void removeEvent() {
            super.removeEvent();
            System.out.println("Removing an event from the digital calendar (using an app or software)...");
        }

        public void viewEvents() {
            super.viewEvents();
            System.out.println("Viewing events on the digital calendar (on a device or app)...");
        }

        public void checkDate() {
            super.checkDate();
            System.out.println("Checking the current date on the digital calendar (on a device or app)...");
        }

        public void printCalendar() {
            super.printCalendar();
            System.out.println("Printing the digital calendar (or exporting to PDF)...");
        }

        public void setReminder() {
            System.out.println("Setting a reminder for the event on the digital calendar...");
        }

        public void syncCalendar() {
            System.out.println("Syncing the digital calendar with other devices...");
        }
    }

