package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Cable;

public class CableRunner {
        public static void main(String[] args) {
            Cable c = new Cable();
            System.out.println(c);
            System.out.println(new Cable().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(c));

            Cable cable1 = new Cable();
            cable1.setLength(10);
            Cable cable2 = new Cable();
            cable2.setLength(15);
            boolean same = cable1.equals(cable2);
            System.out.println("both same:" + same);
        }
    }

