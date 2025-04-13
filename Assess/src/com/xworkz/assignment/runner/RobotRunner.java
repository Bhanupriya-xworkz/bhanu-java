package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Robot;

public class RobotRunner {
        public static void main(String[] args) {
            Robot r = new Robot();
            System.out.println(r);
            System.out.println(new Robot().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(r));

            Robot robot1 = new Robot();
            robot1.setOperational(true);
            Robot robot2 = new Robot();
            robot2.setOperational(false);
            boolean same = robot1.equals(robot2);
            System.out.println("both same:" + same);
        }
    }

