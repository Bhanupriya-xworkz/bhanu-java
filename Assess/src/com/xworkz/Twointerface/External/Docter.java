package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Doctor;
import com.xworkz.Twointerface.Internal.Surgeon;

public class Docter {

        public static void main(String[] args) {
            Doctor d1 = new Surgeon();
            Doctor d2 = new Dentist();

            d1.getDoctorName();
            d2.getHospital();

            Specialization s1 = new Surgeon();
            Specialization s2 = new Dentist();

            s1.getSpecializationName();
            s2.getYearsOfExperience();
        }
    }

