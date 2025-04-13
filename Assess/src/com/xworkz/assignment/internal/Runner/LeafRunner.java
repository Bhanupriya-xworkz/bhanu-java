package com.xworkz.assignment.internal.Runner;
import com.xworkz.assignment.internal.veriable.Leaf;

public class LeafRunner {
        public static void main(String[] args) {
            Leaf l = new Leaf();
            System.out.println(l);
            System.out.println(new Leaf().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(l));

            Leaf leaf1 = new Leaf();
            leaf1.setGreen(true);
            Leaf leaf2 = new Leaf();
            leaf2.setGreen(false);
            boolean same = leaf1.equals(leaf2);
            System.out.println("both same: " + same);
        }
    }

