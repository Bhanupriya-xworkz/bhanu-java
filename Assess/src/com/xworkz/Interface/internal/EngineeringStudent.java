package com.xworkz.Interface.internal;

    public class EngineeringStudent implements Student {

        @Override
        public void study() {
            System.out.println("Engineering student is studying Data Structures.");
        }

        @Override
        public void attendClass() {
            System.out.println("Engineering student is attending OOP class.");
        }

        @Override
        public void submitAssignment() {
            System.out.println("Engineering student submitted Java project.");
        }
    }

    @Override
    public void studyTip() {
        System.out.println("University Student Tip: Participate actively in class discussions to improve learning.");


