package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Gold;

public class GoldRunner {
        public static void main(String[] args) {
            Gold g = new Gold();
            System.out.println(g);
            System.out.println(new Gold().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(g));

            Gold gold1 = new Gold();
            gold1.setPure(true);
            Gold gold2 = new Gold();
            gold2.setPure(false);
            boolean same = gold1.equals(gold2);
            System.out.println("both same: " + same);
        }
    }

