package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Fiber;

public class FiberRunner {
        public static void main(String[] args) {
            Fiber f = new Fiber();
            System.out.println(f);
            System.out.println(new Fiber().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(f));

            Fiber fiber1 = new Fiber();
            fiber1.setOrganic(true);
            Fiber fiber2 = new Fiber();
            fiber2.setOrganic(false);
            boolean same = fiber1.equals(fiber2);
            System.out.println("both same: " + same);
        }
    }

