package com.xworkz.Interface.internal;

    public interface College {
        void conductClasses();
        void holdExams();
        void declareResults();

        default void admissionTips() {
            System.out.println("General Tip: Research courses and campus life before applying.");
        }
    }

