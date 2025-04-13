package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Plastic;

public class PlasticRunner {
        public static void main(String[] args) {
            Plastic p = new Plastic();
            System.out.println(p);
            System.out.println(new Plastic().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(p));

            Plastic plastic1 = new Plastic();
            plastic1.setRecyclable(true);
            Plastic plastic2 = new Plastic();
            plastic2.setRecyclable(false);
            boolean same = plastic1.equals(plastic2);
            System.out.println("both same:" + same);
        }
    }

