package com.xworkz.assignment.internal.veriable;

    public class Bracelet {
        private String material;
        private double size;
        private boolean hasGemstone;

        public Bracelet() {
            System.out.println("Running no-arg constructor of Bracelet");
            this.material = "Gold";
            this.size = 18.0;
            this.hasGemstone = false;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Size: " + size + " cm, Has Gemstone: " + hasGemstone;
        }

        @Override
        public int hashCode() {
            System.out.println("BraceletHashCode" + super.hashCode());
            return 350;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSize(double size) {
            this.size = size;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Bracelet) {
                    System.out.println("have ref. will compare..");
                    Bracelet bracelet1 = this;
                    Bracelet bracelet2 = (Bracelet) obj;
                    if (bracelet1.material.equals(bracelet2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

