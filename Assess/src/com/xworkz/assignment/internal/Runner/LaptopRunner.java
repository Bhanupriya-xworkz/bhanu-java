package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Laptop;

public class LaptopRunner {
        public static void main(String[] args) {
            Laptop l = new Laptop();
            System.out.println(l);
            System.out.println(new Laptop().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(l));

            Laptop laptop1 = new Laptop();
            laptop1.setTouchscreen(true);
            Laptop laptop2 = new Laptop();
            laptop2.setTouchscreen(false);
            boolean same = laptop1.equals(laptop2);
            System.out.println("both same: " + same);
        }
    }

