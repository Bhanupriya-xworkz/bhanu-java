package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Mountain;

public class MountainRunner {
        public static void main(String[] args) {
            Mountain m = new Mountain();
            System.out.println(m);
            System.out.println(new Mountain().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(m));

            Mountain mountain1 = new Mountain();
            mountain1.setName("Everest");
            mountain1.setHeight(8848);  // height in meters
            Mountain mountain2 = new Mountain();
            mountain2.setName("K2");
            mountain2.setHeight(8611);  // height in meters
            boolean same = mountain1.equals(mountain2);
            System.out.println("both same:" + same);
        }
    }

