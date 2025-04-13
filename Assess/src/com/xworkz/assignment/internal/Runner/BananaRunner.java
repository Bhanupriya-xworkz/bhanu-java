package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Banana;

public class BananaRunner {
        public static void main(String[] args) {
            Banana b = new Banana();
            System.out.println(b);
            System.out.println(new Banana().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(b));

            Banana banana1 = new Banana();
            banana1.setRipe(true);
            Banana banana2 = new Banana();
            banana2.setRipe(false);
            boolean same = banana1.equals(banana2);
            System.out.println("both same: " + same);
        }
    }

