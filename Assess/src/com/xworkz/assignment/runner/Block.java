package com.xworkz.assignment.runner;
import com.xworkz.inheretence.internal.Block;

public class BlockRunner {
        public static void main(String[] args) {
            Block b = new Block();
            System.out.println(b);
            System.out.println(new Block().hashCode());
            System.out.println("original hashCode:" + System.identityHashCode(b));

            Block block1 = new Block();
            block1.setSolid(true);
            Block block2 = new Block();
            block2.setSolid(false);
            boolean same = block1.equals(block2);
            System.out.println("both same:" + same);
        }
    }

