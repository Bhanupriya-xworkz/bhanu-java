package com.xworkz.assignment.internal.veriable3;

    public class Wire {
        private String material;
        private double length;
        private boolean isInsulated;

        public Wire() {
            System.out.println("Running non-arg constructor Wire");
            System.out.println("material: " + this.material);
            this.material = "Copper";
            this.length = 10.0;
            this.isInsulated = true;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Length: " + length + " meters, Is Insulated: " + isInsulated;
        }

        @Override
        public int hashCode() {
            System.out.println("WireHashCode: " + super.hashCode());
            return 998;  // Arbitrary hash code
        }

        // Setters
        public void setMaterial(String material) {
            this.material = material;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setInsulated(boolean isInsulated) {
            this.isInsulated = isInsulated;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Wire wire1 = this;
                Wire wire2 = (Wire) obj;
                if (obj instanceof Wire) {
                    System.out.println("have ref. will compare..");
                    if (wire1.material.equals(wire2.material) && wire1.length == wire2.length && wire1.isInsulated == wire2.isInsulated) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

