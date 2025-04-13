package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Earth;

public class EarthRunner {
        public static void main(String[] args) {
            Earth e = new Earth();
            System.out.println(e);
            System.out.println(new Earth().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(e));

            Earth earth1 = new Earth();
            earth1.setHabitable(true);
            Earth earth2 = new Earth();
            earth2.setHabitable(false);
            boolean same = earth1.equals(earth2);
            System.out.println("both same: " + same);
        }
    }

