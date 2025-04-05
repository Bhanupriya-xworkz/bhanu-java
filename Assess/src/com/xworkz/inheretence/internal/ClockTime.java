package com.xworkz.inheretence.internal;

    public class ClockTime extends Time {
        public void clockTimeInfo() {
            System.out.println("This is time measured by a clock, typically represented in hours, minutes, and seconds.");
        }

        {
            super.timeMeasurement();
            System.out.println("Clock time follows a 12-hour or 24-hour format, depending on the system.");
        }

        {
            super.timeZones();
            System.out.println("Clock time is used in conjunction with time zones to determine the local time.");
        }

        {
            super.timeTravel();
            System.out.println("Although time travel is not possible in reality, clock time is a reference for time-based activities.");
        }

        {
            super.timeHistory();
            System.out.println("Clock time has evolved from sundials to mechanical clocks to modern digital devices.");
        }
    }

