package com.xworkz.assignment.internal.veriable2;

    public class Bracelet {
        private String material;
        private double size; // in centimeters
        private boolean isGold;

        public Bracelet(String material, double size, boolean isGold) {
            this.material = material;
            this.size = size;
            this.isGold = isGold;
        }

        @Override
        public String toString() {
            return "Bracelet{material=" + material + ", size=" + size + "cm, isGold=" + isGold + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("BraceletHashCode:" + super.hashCode());
            return 8748;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void setIsGold(boolean isGold) {
            this.isGold = isGold;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Bracelet) {
                    System.out.println("have ref. will compare..");
                    Bracelet bracelet1 = this;
                    Bracelet bracelet2 = (Bracelet) obj;
                    if (bracelet1.material.equals(bracelet2.material) && bracelet1.size == bracelet2.size && bracelet1.isGold == bracelet2.isGold) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

