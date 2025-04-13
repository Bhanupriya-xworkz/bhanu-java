package com.xworkz.assignment.internal.veriable;

public class Daimond {
    public class Diamond {
        private String color;
        private double weight;
        private boolean isCertified;

        public Diamond() {
            System.out.println("Running no-arg constructor of Diamond");
            this.color = "D";
            this.weight = 1.0;
            this.isCertified = true;
        }

        @Override
        public String toString() {
            return "Color: " + color + ", Weight: " + weight + " carats, Is Certified: " + isCertified;
        }

        @Override
        public int hashCode() {
            System.out.println("DiamondHashCode" + super.hashCode());
            return 220;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Diamond) {
                    System.out.println("have ref. will compare..");
                    Diamond diamond1 = this;
                    Diamond diamond2 = (Diamond) obj;
                    if (diamond1.color.equals(diamond2.color)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


}
