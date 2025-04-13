package com.xworkz.assignment.runner;

import
    public class EyeRunner {
        public static void main(String[] args) {
            Eye e = new Eye();
            System.out.println(e);
            System.out.println(new Eye().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(e));

            Eye eye1 = new Eye();
            eye1.setHealthy(true);
            Eye eye2 = new Eye();
            eye2.setHealthy(false);
            boolean same = eye1.equals(eye2);
            System.out.println("both same: " + same);
        }
    }

