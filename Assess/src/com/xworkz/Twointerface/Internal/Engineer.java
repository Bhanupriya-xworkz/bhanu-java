package com.xworkz.Twointerface.Internal;

    public class Engineer implements Person, Job {

        @Override
        public void getName() {
            System.out.println("Name: Rahul");
        }

        @Override
        public void getAge() {
            System.out.println("Age: 29");
        }

        @Override
        public void getJobTitle() {
            System.out.println("Job Title: Software Engineer");
        }

        @Override
        public void getSalary() {
            System.out.println("Salary: ₹12,00,000 per year");
        }
    }

public class Teacher implements Person, Job {

    @Override
    public void getName() {
        System.out.println("Name: Meena");
    }

    @Override
    public void getAge() {
        System.out.println("Age: 35");
    }

    @Override
    public void getJobTitle() {
        System.out.println("Job Title: High School Teacher");
    }

    @Override
    public void getSalary() {
        System.out.println("Salary: ₹5,50,000 per year");
    }
}

