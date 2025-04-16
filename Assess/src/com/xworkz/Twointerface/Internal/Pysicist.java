package com.xworkz.Twointerface.Internal;

    public class Physicist implements Scientist, Research {

        @Override
        public void getName() {
            System.out.println("Name: Dr. Kumar");
        }

        @Override
        public void getField() {
            System.out.println("Field: Theoretical Physics");
        }

        @Override
        public void getProjectTitle() {
            System.out.println("Project: Quantum Gravity");
        }

        @Override
        public void getDuration() {
            System.out.println("Duration: 5 years");
        }
    }

public class Biologist implements Scientist, Research {

    @Override
    public void getName() {
        System.out.println("Name: Dr. Neha");
    }

    @Override
    public void getField() {
        System.out.println("Field: Molecular Biology");
    }

    @Override
    public void getProjectTitle() {
        System.out.println("Project: DNA Repair Mechanisms");
    }

    @Override
    public void getDuration() {
        System.out.println("Duration: 3 years");
    }
}

