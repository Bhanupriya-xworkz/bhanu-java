package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Square;

public class SquareRunner {
        public static void main(String[] args) {
            Square s = new Square();
            System.out.println(s);
            System.out.println(new Square().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(s));

            Square square1 = new Square();
            square1.setSideLength(5);
            Square square2 = new Square();
            square2.setSideLength(5);
            boolean same = square1.equals(square2);
            System.out.println("both same:" + same);
        }
    }
