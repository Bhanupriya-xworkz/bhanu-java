package com.xworkz.assignment.internal.veriable;

    public class Water {
        private String source;
        private double volume;
        private boolean isMineralWater;

        public Water() {
            System.out.println("Running no-arg constructor of Water");
            this.source = "Spring";
            this.volume = 1.0;
            this.isMineralWater = true;
        }

        @Override
        public String toString() {
            return "Source: " + source + ", Volume: " + volume + "L, Is Mineral Water: " + isMineralWater;
        }

        @Override
        public int hashCode() {
            System.out.println("WaterHashCode" + super.hashCode());
            return 190;
        }

        public void setSource(String source) {
            this.source = source;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Water) {
                    System.out.println("have ref. will compare..");
                    Water water1 = this;
                    Water water2 = (Water) obj;
                    if (water1.source.equals(water2.source)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

