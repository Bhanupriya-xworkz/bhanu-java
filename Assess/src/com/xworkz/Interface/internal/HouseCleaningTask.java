package com.xworkz.Interface.internal;

    public class HouseCleaningTask implements Task {
        @Override
        public void startTask() {
            System.out.println("Started house cleaning task.");
        }

        @Override
        public void completeTask() {
            System.out.println("Completed house cleaning task.");
        }

        @Override
        public void cancelTask() {
            System.out.println("Canceled house cleaning task.");
        }
    }

    @Override
    public void taskTip() {
        System.out.println("Task Tip: Prioritize tasks by urgency and importance.");
    }

