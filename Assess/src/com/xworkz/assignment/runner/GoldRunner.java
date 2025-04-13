package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Gold;

public class GoldRunner {
        public static void main(String[] args) {
            Gold g = new Gold();
            System.out.println(g);
            System.out.println(new Gold().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(g));

            Gold gold1 = new Gold();
            gold1.setPurity(99.9);
            Gold gold2 = new Gold();
            gold2.setPurity(90.5);
            boolean same = gold1.equals(gold2);
            System.out.println("both same:" + same);
        }
    }

