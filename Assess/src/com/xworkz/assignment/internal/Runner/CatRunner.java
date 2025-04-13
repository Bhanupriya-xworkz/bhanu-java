package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Cat;

public class CatRunner {
        public static void main(String[] args) {
            Cat c = new Cat();
            System.out.println(c);
            System.out.println(new Cat().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(c));

            Cat cat1 = new Cat();
            cat1.setSleepy(true);
            Cat cat2 = new Cat();
            cat2.setSleepy(false);
            boolean same = cat1.equals(cat2);
            System.out.println("both same: " + same);
        }
    }

