package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Circle;

public class CircleRunner {
        public static void main(String[] args) {
            Circle c = new Circle();
            System.out.println(c);
            System.out.println(new Circle().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(c));

            Circle circle1 = new Circle();
            circle1.setFilled(true);
            Circle circle2 = new Circle();
            circle2.setFilled(false);
            boolean same = circle1.equals(circle2);
            System.out.println("both same: " + same);
        }
    }

