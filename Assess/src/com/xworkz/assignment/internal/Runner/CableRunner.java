package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Cable;

public class CableRunner {
        public static void main(String[] args) {
            Cable c = new Cable();
            System.out.println(c);
            System.out.println(new Cable().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(c));

            Cable cable1 = new Cable();
            cable1.setConnected(true);
            Cable cable2 = new Cable();
            cable2.setConnected(false);
            boolean same = cable1.equals(cable2);
            System.out.println("both same: " + same);
        }
    }

