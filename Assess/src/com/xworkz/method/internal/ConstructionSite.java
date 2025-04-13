package com.xworkz.method.internal;

    public class ConstructionSite extends Block {

        public void checkSafety() {
            System.out.println("ConstructionSite: Safety check is complete.");
        }

        public void Dbc(Block block) {
            block.place();
            block.remove();
            block.paint();
            block.rotate();
            block.duplicate();

            if (block instanceof ConstructionSite) {
                ConstructionSite site = (ConstructionSite) block;
                System.out.println("Block is an instance of ConstructionSite.");
                site.checkSafety();
            }
        }
    }

