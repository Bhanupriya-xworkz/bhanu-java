package com.xworkz.Interface.internal;

    public interface Student {
        void study();
        void attendClass();
        void submitAssignment();

        default void studyTip() {
            System.out.println("General Tip: Make a study schedule and stick to it for better results.");
        }
    }

