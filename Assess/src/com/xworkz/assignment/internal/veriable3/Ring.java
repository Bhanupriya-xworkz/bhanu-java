package com.xworkz.assignment.internal.veriable3;

    public class Ring {
        private String material;
        private double size;
        private boolean isEngraved;

        public Ring() {
            System.out.println("running non-arg constructor Ring");
            System.out.println("material: " + this.material);
            this.material = "Gold";
            this.size = 6.5;
            this.isEngraved = false;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Size: " + size + ", Is Engraved: " + isEngraved;
        }

        @Override
        public int hashCode() {
            System.out.println("RingHashCode: " + super.hashCode());
            return 9876; // Arbitrary hash code
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void setEngraved(boolean isEngraved) {
            this.isEngraved = isEngraved;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Ring ring1 = this;
                Ring ring2 = (Ring) obj;
                if (obj instanceof Ring) {
                    System.out.println("have ref. will compare..");
                    if (ring1.material.equals(ring2.material) && ring1.size == ring2.size && ring1.isEngraved == ring2.isEngraved) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

