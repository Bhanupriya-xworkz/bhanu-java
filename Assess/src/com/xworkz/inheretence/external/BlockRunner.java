package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Block;
import com.xworkz.inheretence.internal.NotebookBlock;

public class BlockRunner {
        public static void main(String[] args) {
            Block block = new NotebookBlock();

            Block simpleBlock = new Block();
            simpleBlock.breakBlock();
        }
    }

