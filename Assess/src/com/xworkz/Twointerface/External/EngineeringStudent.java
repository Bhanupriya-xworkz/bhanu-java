package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.EngineeringStudent;
import com.xworkz.Twointerface.Internal.Student;

public class EngineeringStudentMain {
        public static void main(String[] args) {
            Student student1 = new EngineeringStudent();
            Student student2 = new MedicalStudent();

            student1.getName();
            student2.getRollNumber();

            Result result1 = new EngineeringStudent();
            Result result2 = new MedicalStudent();

            result1.getMarks();
            result2.getGrade();
        }
    }

