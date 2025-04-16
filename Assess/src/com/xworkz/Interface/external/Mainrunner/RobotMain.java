package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Robot;
import com.xworkz.Interface.internal.ServiceRobot;

    public class RobotMain {
        public static void main(String[] args) {
            Robot robot1 = new ServiceRobot();
            robot1.wakeUp();
            robot1.performTask();
            robot1.shutDown();
        }
    }

