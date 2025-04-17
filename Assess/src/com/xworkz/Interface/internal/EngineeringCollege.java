package com.xworkz.Interface.internal;

    public class EngineeringCollege implements College {

        @Override
        public void conductClasses() {
            System.out.println("Engineering classes are being conducted.");
        }

        @Override
        public void holdExams() {
            System.out.println("Semester exams are being held.");
        }

        @Override
        public void declareResults() {
            System.out.println("Results have been declared.");
        }
    }
    @Override
    public void admissionTips() {
        System.out.println("Engineering College Tip: Prepare for entrance exams like JEE and attend counseling rounds.");
    }

