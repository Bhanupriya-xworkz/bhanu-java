package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Air;

public class AirRunner {
        public static void main(String[] args) {
            Air a = new Air();
            System.out.println(a);
            System.out.println(new Air().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(a));

            Air air1 = new Air();
            air1.setFresh(true);
            Air air2 = new Air();
            air2.setFresh(false);
            boolean same = air1.equals(air2);
            System.out.println("both same: " + same);
        }
    }
