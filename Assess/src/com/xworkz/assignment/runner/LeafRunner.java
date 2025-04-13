package com.xworkz.assignment.runner;
import com.xworkz.assignment.internal.veriable.Leaf;

public class LeafRunner {
        public static void main(String[] args) {
            Leaf l = new Leaf();
            System.out.println(l);
            System.out.println(new Leaf().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(l));

            Leaf leaf1 = new Leaf();
            leaf1.setColor("Green");
            leaf1.setSize(15);
            Leaf leaf2 = new Leaf();
            leaf2.setColor("Yellow");
            leaf2.setSize(15);
            boolean same = leaf1.equals(leaf2);
            System.out.println("both same:" + same);
        }
    }

