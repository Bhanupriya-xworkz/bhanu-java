package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.DigitalWatch;
import com.xworkz.Interface.internal.Watch;

public class WatchMain {
        public static void main(String[] args) {
            Watch watch1 = new DigitalWatch();
            Watch watch2 = new DigitalWatch();
            Watch watch3 = new DigitalWatch();

            watch1.showTime();
            watch2.showDate();
            watch3.showAlarm();
        }
    }

