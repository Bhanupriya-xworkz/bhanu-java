package com.xworkz.Interface.internal;

    public class ServiceRobot implements Robot {
        @Override
        public void wakeUp() {
            System.out.println("ServiceRobot executing: wakeUp");
        }

        @Override
        public void performTask() {
            System.out.println("ServiceRobot executing: performTask");
        }

        @Override
        public void shutDown() {
            System.out.println("ServiceRobot executing: shutDown");
        }
    }

