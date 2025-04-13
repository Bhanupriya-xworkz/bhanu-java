package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Ball;

public class BallRunner {
        public static void main(String[] args) {
            Ball b = new Ball();
            System.out.println(b);
            System.out.println(new Ball().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(b));

            Ball ball1 = new Ball();
            ball1.setRound(true);
            Ball ball2 = new Ball();
            ball2.setRound(false);
            boolean same = ball1.equals(ball2);
            System.out.println("both same: " + same);
        }
    }

