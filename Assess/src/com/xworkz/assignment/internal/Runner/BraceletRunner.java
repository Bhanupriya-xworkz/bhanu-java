package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Bracelet;

public class BraceletRunner {
        public static void main(String[] args) {
            Bracelet b = new Bracelet();
            System.out.println(b);
            System.out.println(new Bracelet().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(b));

            Bracelet bracelet1 = new Bracelet();
            bracelet1.setGold(true);
            Bracelet bracelet2 = new Bracelet();
            bracelet2.setGold(false);
            boolean same = bracelet1.equals(bracelet2);
            System.out.println("both same: " + same);
        }
    }

