package com.xworkz.assignment.internal.veriable3;

    public class Platinum {
        private String origin;
        private double purity;
        private boolean isPrecious;

        public Platinum() {
            System.out.println("Running non-arg constructor Platinum");
            System.out.println("origin: " + this.origin);
            this.origin = "South Africa";
            this.purity = 99.95;
            this.isPrecious = true;
        }

        @Override
        public String toString() {
            return "Origin: " + origin + ", Purity: " + purity + ", IsPrecious: " + isPrecious;
        }

        @Override
        public int hashCode() {
            System.out.println("PlatinumHashCode: " + super.hashCode());
            return 9991;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public void setPurity(double purity) {
            this.purity = purity;
        }

        public void setPrecious(boolean isPrecious) {
            this.isPrecious = isPrecious;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Platinum) {
                    System.out.println("Have reference. Will compare...");
                    Platinum p1 = this;
                    Platinum p2 = (Platinum) obj;
                    if (p1.origin.equals(p2.origin) && p1.purity == p2.purity && p1.isPrecious == p2.isPrecious) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

