package com.xworkz.Twointerface.Internal;

    public class MathCource implements Course, Exam {

        @Override
        public void getCourseName() {
            System.out.println("Course: Mathematics");
        }

        @Override
        public void getDuration() {
            System.out.println("Duration: 3 months");
        }

        @Override
        public void getExamType() {
            System.out.println("Exam Type: Written");
        }

        @Override
        public void getPassingMarks() {
            System.out.println("Passing Marks: 40");
        }
    }

public class ScienceCourse implements Course, Exam {

    @Override
    public void getCourseName() {
        System.out.println("Course: Science");
    }

    @Override
    public void getDuration() {
        System.out.println("Duration: 4 months");
    }

    @Override
    public void getExamType() {
        System.out.println("Exam Type: Practical + Written");
    }

    @Override
    public void getPassingMarks() {
        System.out.println("Passing Marks: 50");
    }
}


