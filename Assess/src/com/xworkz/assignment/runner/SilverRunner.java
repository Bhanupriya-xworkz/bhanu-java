package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Silver;

public class SilverRunner {
        public static void main(String[] args) {
            Silver s = new Silver();
            System.out.println(s);
            System.out.println(new Silver().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(s));

            Silver silver1 = new Silver();
            silver1.setPurityLevel(92);
            Silver silver2 = new Silver();
            silver2.setPurityLevel(92);
            boolean same = silver1.equals(silver2);
            System.out.println("both same:" + same);
        }
    }

