package com.xworkz.assignment.internal.Runner;
import com.xworkz.inheretence.internal.Block;

public class BlockRunner {
        public static void main(String[] args) {
            Block b = new Block();
            System.out.println(b);
            System.out.println(new Block().hashCode());
            System.out.println("original hashCode: " + System.identityHashCode(b));

            Block block1 = new Block();
            block1.setHeavy(true);
            Block block2 = new Block();
            block2.setHeavy(false);
            boolean same = block1.equals(block2);
            System.out.println("both same: " + same);
        }
    }

