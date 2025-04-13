package com.xworkz.assignment.internal.veriable3;

    public class Sea {
        private String name;
        private double depth;
        private boolean isSaltWater;

        public Sea() {
            System.out.println("Running non-arg constructor Sea");
            System.out.println("name: " + this.name);
            this.name = "Pacific Ocean";
            this.depth = 10924.0;  // Depth in meters
            this.isSaltWater = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Depth: " + depth + " meters, Is Salt Water: " + isSaltWater;
        }

        @Override
        public int hashCode() {
            System.out.println("SeaHashCode: " + super.hashCode());
            return 9192;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDepth(double depth) {
            this.depth = depth;
        }

        public void setIsSaltWater(boolean isSaltWater) {
            this.isSaltWater = isSaltWater;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Sea) {
                    System.out.println("Have reference. Will compare...");
                    Sea s1 = this;
                    Sea s2 = (Sea) obj;
                    if (s1.name.equals(s2.name) &&
                            s1.depth == s2.depth &&
                            s1.isSaltWater == s2.isSaltWater) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

