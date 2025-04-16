package com.xworkz.Twointerface.Internal;

    public class Surgeon implements Doctor, Specialization {

        @Override
        public void getDoctorName() {
            System.out.println("Doctor: Dr. Smith");
        }

        @Override
        public void getHospital() {
            System.out.println("Hospital: City General Hospital");
        }

        @Override
        public void getSpecializationName() {
            System.out.println("Specialization: Cardiac Surgery");
        }

        @Override
        public void getYearsOfExperience() {
            System.out.println("Experience: 12 years");
        }
    }

public class Dentist implements Doctor, Specialization {

    @Override
    public void getDoctorName() {
        System.out.println("Doctor: Dr. Patel");
    }

    @Override
    public void getHospital() {
        System.out.println("Hospital: Smile Dental Care");
    }

    @Override
    public void getSpecializationName() {
        System.out.println("Specialization: Orthodontics");
    }

    @Override
    public void getYearsOfExperience() {
        System.out.println("Experience: 8 years");
    }
}

