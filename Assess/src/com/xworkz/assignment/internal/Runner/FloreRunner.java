package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Flore;

public class FloreRunner {
        public static void main(String[] args) {
            Flore f = new Flore();
            System.out.println(f);
            System.out.println(new Flore().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(f));

            Flore flore1 = new Flore();
            flore1.setBlooming(true);
            Flore flore2 = new Flore();
            flore2.setBlooming(false);
            boolean same = flore1.equals(flore2);
            System.out.println("both same: " + same);
        }
    }

