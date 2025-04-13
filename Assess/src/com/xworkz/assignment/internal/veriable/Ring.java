package com.xworkz.assignment.internal.veriable;

    public class Ring {
        private String material;
        private String size;
        private boolean isGold;

        public Ring() {
            System.out.println("Running no-arg constructor of Ring");
            this.material = "Gold";
            this.size = "Medium";
            this.isGold = true;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Size: " + size + ", Is Gold: " + isGold;
        }

        @Override
        public int hashCode() {
            System.out.println("RingHashCode" + super.hashCode());
            return 180;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Ring) {
                    System.out.println("have ref. will compare..");
                    Ring ring1 = this;
                    Ring ring2 = (Ring) obj;
                    if (ring1.material.equals(ring2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

