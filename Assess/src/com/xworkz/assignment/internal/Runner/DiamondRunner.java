package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable2.Diamond;

public class DiamondRunner {
        public static void main(String[] args) {
            Diamond d = new Diamond();
            System.out.println(d);
            System.out.println(new Diamond().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(d));

            Diamond diamond1 = new Diamond();
            diamond1.setSparkling(true);
            Diamond diamond2 = new Diamond();
            diamond2.setSparkling(false);
            boolean same = diamond1.equals(diamond2);
            System.out.println("both same: " + same);
        }
    }

