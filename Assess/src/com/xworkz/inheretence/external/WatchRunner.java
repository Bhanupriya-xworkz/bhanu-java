package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.SmartWatch;
import com.xworkz.inheretence.internal.Watch;

public class WatchRunner {
        public static void main(String[] args) {

            Watch smartWatch = new SmartWatch();

            Watch traditionalWatch = new Watch();

            smartWatch.displayTime();
            smartWatch.setAlarm();
            smartWatch.trackFitness();
            smartWatch.receiveNotifications();
            smartWatch.monitorHeartRate();

            traditionalWatch.displayTime();
            traditionalWatch.setAlarm();
        }
    }
