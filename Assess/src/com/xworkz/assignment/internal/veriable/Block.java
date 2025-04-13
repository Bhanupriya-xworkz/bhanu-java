package com.xworkz.assignment.internal.veriable;

    public class Block {
        private String material;
        private double weight;
        private boolean isSolid;

        public Block() {
            System.out.println("Running no-arg constructor of Block");
            this.material = "Concrete";
            this.weight = 50.0;
            this.isSolid = true;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Weight: " + weight + "kg, Is Solid: " + isSolid;
        }

        @Override
        public int hashCode() {
            System.out.println("BlockHashCode" + super.hashCode());
            return 340;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Block) {
                    System.out.println("have ref. will compare..");
                    Block block1 = this;
                    Block block2 = (Block) obj;
                    if (block1.material.equals(block2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

