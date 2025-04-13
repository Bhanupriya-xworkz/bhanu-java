package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Nail;

public class NailRunner {
        public static void main(String[] args) {
            Nail n = new Nail();
            System.out.println(n);
            System.out.println(new Nail().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(n));

            Nail nail1 = new Nail();
            nail1.setMaterial("Steel");
            nail1.setLength(5);  // length in centimeters
            Nail nail2 = new Nail();
            nail2.setMaterial("Iron");
            nail2.setLength(5);  // length in centimeters
            boolean same = nail1.equals(nail2);
            System.out.println("both same:" + same);
        }
    }

