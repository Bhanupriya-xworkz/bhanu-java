package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.wings;
import com.xworkz.assignment.internal.veriable.Wings;

public class WingsRunner {
        public static void main(String[] args) {
            Wings w = new Wings();
            System.out.println(w);
            System.out.println(new Wings().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(w));

            Wings wings1 = new Wings();
            wings1.setFeathered(true);
            Wings wings2 = new Wings();
            wings2.setFeathered(false);
            boolean same = wings1.equals(wings2);
            System.out.println("both same: " + same);
        }
    }

