package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Bed;

public class BedRunner {
        public static void main(String[] args) {
            Bed b = new Bed();
            System.out.println(b);
            System.out.println(new Bed().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(b));

            Bed bed1 = new Bed();
            bed1.setSoft(true);
            Bed bed2 = new Bed();
            bed2.setSoft(false);
            boolean same = bed1.equals(bed2);
            System.out.println("both same: " + same);
        }
    }
