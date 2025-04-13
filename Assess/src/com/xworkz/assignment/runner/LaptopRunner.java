package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Laptop;

public class LaptopRunner {
        public static void main(String[] args) {
            Laptop l = new Laptop();
            System.out.println(l);
            System.out.println(new Laptop().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(l));

            Laptop laptop1 = new Laptop();
            laptop1.setModel("Dell XPS 13");
            laptop1.setRamSize(16);
            Laptop laptop2 = new Laptop();
            laptop2.setModel("MacBook Pro");
            laptop2.setRamSize(16);
            boolean same = laptop1.equals(laptop2);
            System.out.println("both same:" + same);
        }
    }

