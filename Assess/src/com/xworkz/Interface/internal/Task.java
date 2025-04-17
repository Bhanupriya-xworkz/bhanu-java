package com.xworkz.Interface.internal;

    public interface Task {
        void startTask();
        void completeTask();
        void cancelTask();

        default void taskTip() {
            System.out.println("General Tip: Break large tasks into smaller ones for easier tracking.");
        }
    }

