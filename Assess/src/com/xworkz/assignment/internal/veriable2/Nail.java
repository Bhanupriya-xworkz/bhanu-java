package com.xworkz.assignment.internal.veriable2;

    public class Nail {
        private String material;
        private double length;
        private boolean isRustProof;

        public Nail(String material, double length, boolean isRustProof) {
            this.material = material;
            this.length = length;
            this.isRustProof = isRustProof;
        }

        @Override
        public String toString() {
            return "Nail{material='" + material + "', length=" + length + ", isRustProof=" + isRustProof + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("NailHashCode: " + super.hashCode());
            return 3344; // Arbitrary hash code
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setIsRustProof(boolean isRustProof) {
            this.isRustProof = isRustProof;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Nail) {
                    System.out.println("Comparing Nail objects...");
                    Nail n1 = this;
                    Nail n2 = (Nail) obj;
                    if (n1.material.equals(n2.material) && n1.length == n2.length && n1.isRustProof == n2.isRustProof) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

