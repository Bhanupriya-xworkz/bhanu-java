package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.EngineeringStudent;
import com.xworkz.Interface.internal.Student;

    public class StudentMain {
        public static void main(String[] args) {
            Student student1 = new EngineeringStudent();
            Student student2 = new EngineeringStudent();
            Student student3 = new EngineeringStudent();

            student1.study();
            student2.attendClass();
            student3.submitAssignment();
        }
    }

