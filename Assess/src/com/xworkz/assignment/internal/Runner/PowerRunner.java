package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Power;

public class PowerRunner {
        public static void main(String[] args) {
            Power p = new Power();
            System.out.println(p);
            System.out.println(new Power().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(p));

            Power power1 = new Power();
            power1.setHighPower(true);
            Power power2 = new Power();
            power2.setHighPower(false);
            boolean same = power1.equals(power2);
            System.out.println("both same: " + same);
        }
    }

