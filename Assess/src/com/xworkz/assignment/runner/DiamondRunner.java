package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.veriable2.Diamond;

public class DiamondRunner {
        public static void main(String[] args) {
            Diamond d = new Diamond();
            System.out.println(d);
            System.out.println(new Diamond().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(d));

            Diamond diamond1 = new Diamond();
            diamond1.setCarat(1.5);
            Diamond diamond2 = new Diamond();
            diamond2.setCarat(2.0);
            boolean same = diamond1.equals(diamond2);
            System.out.println("both same:" + same);
        }
    }

