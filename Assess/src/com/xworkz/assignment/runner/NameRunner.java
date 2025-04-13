package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Name;

public class NameRunner {
        public static void main(String[] args) {
            Name n = new Name();
            System.out.println(n);
            System.out.println(new Name().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(n));

            Name name1 = new Name();
            name1.setFirstName("John");
            name1.setLastName("Doe");
            Name name2 = new Name();
            name2.setFirstName("Jane");
            name2.setLastName("Doe");
            boolean same = name1.equals(name2);
            System.out.println("both same:" + same);
        }
    }

