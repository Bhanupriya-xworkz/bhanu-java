package com.xworkz.assignment.internal.veriable2;

    public class Block {
        private String color;
        private double weight; // in kilograms
        private String material;

        public Block(String color, double weight, String material) {
            this.color = color;
            this.weight = weight;
            this.material = material;
        }

        @Override
        public String toString() {
            return "Block{color=" + color + ", weight=" + weight + "kg, material=" + material + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("BlockHashCode:" + super.hashCode());
            return 8747;
        }

        public void setColor(String color) {
            this.color = color;
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
                    if (block1.color.equals(block2.color) && block1.weight == block2.weight && block1.material.equals(block2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

