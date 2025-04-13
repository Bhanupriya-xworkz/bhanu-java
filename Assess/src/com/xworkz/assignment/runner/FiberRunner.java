package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.veriable.Flore;
    public class FiberRunner {
        public static void main(String[] args) {
            Fiber f = new Fiber();
            System.out.println(f);
            System.out.println(new Fiber().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(f));

            Fiber fiber1 = new Fiber();
            fiber1.setStrength(80.5);
            Fiber fiber2 = new Fiber();
            fiber2.setStrength(90.0);
            boolean same = fiber1.equals(fiber2);
            System.out.println("both same:" + same);
        }
    }

