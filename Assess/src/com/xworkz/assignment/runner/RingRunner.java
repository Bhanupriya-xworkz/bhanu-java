package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Ring;

public class RingRunner {
        public static void main(String[] args) {
            Ring r = new Ring();
            System.out.println(r);
            System.out.println(new Ring().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(r));

            Ring ring1 = new Ring();
            ring1.setGold(true);
            Ring ring2 = new Ring();
            ring2.setGold(false);
            boolean same = ring1.equals(ring2);
            System.out.println("both same:" + same);
        }
    }

