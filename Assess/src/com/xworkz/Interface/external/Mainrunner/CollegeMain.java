package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.College;
import com.xworkz.Interface.internal.EngineeringCollege;

public class CollegeMain {
        public static void main(String[] args) {
            College college1 = new EngineeringCollege();
            College college2 = new EngineeringCollege();
            College college3 = new EngineeringCollege();

            college1.conductClasses();
            college2.holdExams();
            college3.declareResults();
            College.admissionTips();
        }
    }

