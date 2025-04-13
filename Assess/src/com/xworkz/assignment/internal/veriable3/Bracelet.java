package com.xworkz.assignment.internal.veriable3;

    public class Bracelet {
        private String material;
        private double length;
        private boolean isCustomMade;

        public Bracelet() {
            System.out.println("Running non-arg constructor Bracelet");
            System.out.println("material: " + this.material);
            this.material = "Gold";
            this.length = 7.5;
            this.isCustomMade = true;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Length: " + length + ", IsCustomMade: " + isCustomMade;
        }

        @Override
        public int hashCode() {
            System.out.println("BraceletHashCode: " + super.hashCode());
            return 1023;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setCustomMade(boolean isCustomMade) {
            this.isCustomMade = isCustomMade;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Bracelet) {
                    System.out.println("Have reference. Will compare...");
                    Bracelet b1 = this;
                    Bracelet b2 = (Bracelet) obj;
                    if (b1.material.equals(b2.material) && b1.length == b2.length && b1.isCustomMade == b2.isCustomMade) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

