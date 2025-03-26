package com.xworkz.mutator;

public class ClassMain {
    public class Main {
        public static void main(String[] args) {
            Jail myJail = new Jail("Alcatraz", "San Francisco", "John Doe", 100);

            System.out.println("Jail Name: " + myJail.getName());               // Outputs: Alcatraz
            System.out.println("Location: " + myJail.getLocation());            // Outputs: San Francisco
            System.out.println("Jailer's Name: " + myJail.getJailerName());    // Outputs: John Doe
            System.out.println("Total Cells: " + myJail.getTotalCells());      // Outputs: 100

            myJail.setName("Sing Sing");
            myJail.setLocation("New York");
            myJail.setJailerName("Jane Smith");
            myJail.setTotalCells(120);

            System.out.println("Updated Jail Name: " + myJail.getName());      // Outputs: Sing Sing
            System.out.println("Updated Location: " + myJail.getLocation());   // Outputs: New York
            System.out.println("Updated Jailer Name: " + myJail.getJailerName()); // Outputs: Jane Smith
            System.out.println("Updated Total Cells: " + myJail.getTotalCells()); // Outputs: 120
        }
    }

}
