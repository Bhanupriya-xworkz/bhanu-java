package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Course;
import com.xworkz.Twointerface.Internal.ScienceCourse;

public class Cource {

        public static void main(String[] args) {
            Course c1 = new MathCourse();
            Course c2 = new ScienceCourse();

            c1.getCourseName();
            c2.getDuration();

            Exam e1 = new MathCourse();
            Exam e2 = new ScienceCourse();

            e1.getExamType();
            e2.getPassingMarks();
        }
    }

