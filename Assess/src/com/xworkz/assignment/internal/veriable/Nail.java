package com.xworkz.assignment.internal.veriable;

    public class Nail {
        private String material;
        private double length;
        private boolean isRustResistant;

        public Nail() {
            System.out.println("Running no-arg constructor of Nail");
            this.material = "Steel";
            this.length = 5.0;
            this.isRustResistant = false;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Length: " + length + " cm, Is Rust Resistant: " + isRustResistant;
        }

        @Override
        public int hashCode() {
            System.out.println("NailHashCode" + super.hashCode());
            return 260;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Nail) {
                    System.out.println("have ref. will compare..");
                    Nail nail1 = this;
                    Nail nail2 = (Nail) obj;
                    if (nail1.material.equals(nail2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

