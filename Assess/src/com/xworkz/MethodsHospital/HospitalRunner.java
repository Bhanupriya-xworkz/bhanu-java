package com.xworkz.MethodsHospital;

public class HospitalRunner {
    public static void main(String[] args){
        String patientName = "Roopa";
        int age= 32;
        long pNo = 884585;
        String email = "roopa@gmail.com";
        boolean sickness = false;

        Hospital.checkUp(patientName,age,pNo, email, sickness);
    }
}

