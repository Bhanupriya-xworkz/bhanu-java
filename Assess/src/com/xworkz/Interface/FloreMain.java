package com.xworkz.Interface;

import com.xworkz.Interface.internal.FloreCleaner;
import com.xworkz.Interface.internal.RobotCleaner;
    public class FloreMain {

        public static void main(String[] args) {
            FloreCleaner cleaner1 = new RobotCleaner();
            FloreCleaner cleaner2 = new RobotCleaner();
            FloereCleaner cleaner3 = new RobotCleaner();

            cleaner1.startCleaning();
            cleaner2.showStatus();
            cleaner3.stopCleaning();
        }
    }

