package com.xworkz.Twointerface.Internal;

    public class EngineeringStudent implements Student, Result {

        @Override
        public void getName() {
            System.out.println("Name: Rahul Mehta");
        }

        @Override
        public void getRollNumber() {
            System.out.println("Roll Number: ENG101");
        }

        @Override
        public void getMarks() {
            System.out.println("Marks: 88");
        }

        @Override
        public void getGrade() {
            System.out.println("Grade: A");
        }
    }

public class MedicalStudent implements Student, Result {

    @Override
    public void getName() {
        System.out.println("Name: Anjali Singh");
    }

    @Override
    public void getRollNumber() {
        System.out.println("Roll Number: MED202");
    }

    @Override
    public void getMarks() {
        System.out.println("Marks: 92");
    }

    @Override
    public void getGrade() {
        System.out.println("Grade: A+");
    }
}


