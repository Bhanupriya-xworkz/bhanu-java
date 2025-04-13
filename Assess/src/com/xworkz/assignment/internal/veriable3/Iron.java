package com.xworkz.assignment.internal.veriable3;

    public class Iron {
        private String origin;
        private double weight;
        private boolean isMagnetic;

        public Iron() {
            System.out.println("Running non-arg constructor Iron");
            System.out.println("origin: " + this.origin);
            this.origin = "India";
            this.weight = 10.5;
            this.isMagnetic = true;
        }

        @Override
        public String toString() {
            return "Origin: " + origin + ", Weight: " + weight + ", IsMagnetic: " + isMagnetic;
        }

        @Override
        public int hashCode() {
            System.out.println("IronHashCode: " + super.hashCode());
            return 8888;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setMagnetic(boolean isMagnetic) {
            this.isMagnetic = isMagnetic;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Iron) {
                    System.out.println("Have reference. Will compare...");
                    Iron iron1 = this;
                    Iron iron2 = (Iron) obj;
                    if (iron1.origin.equals(iron2.origin) && iron1.weight == iron2.weight && iron1.isMagnetic == iron2.isMagnetic) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

