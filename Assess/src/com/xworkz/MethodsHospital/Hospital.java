package com.xworkz.MethodsHospital;

public class Hospital {
    public static void checkUp(String patientName, int age, long pNo, String email, boolean sickness){
        System.out.println("Running checkUp in Hospital");
        System.out.println("patient name : " + patientName);
        System.out.println("Age : "+age);
        System.out.println("Phone nummer : " + pNo);
        System.out.println("Email id : "+ email);
        System.out.println("Sickness : " + sickness);

        Doctor.treatment(patientName,age);
    }
}

