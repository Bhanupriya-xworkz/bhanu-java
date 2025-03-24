package com.xworkz.MethodsHospital;

public class Doctor {
    public static void treatment(String patientName, int age){
        System.out.println("Running treatment in Doctor");
        System.out.println("Patient name : "+patientName);
        System.out.println("Age : "+age);
        Nurse.assist(patientName);
    }
}
