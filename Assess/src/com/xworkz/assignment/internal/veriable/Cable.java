package com.xworkz.assignment.internal.veriable;

    public class Cable {
        private String type;
        private double length;
        private boolean isCoiled;

        public Cable() {
            System.out.println("Running no-arg constructor of Cable");
            this.type = "HDMI";
            this.length = 1.5;
            this.isCoiled = false;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Length: " + length + "m, Is Coiled: " + isCoiled;
        }

        @Override
        public int hashCode() {
            System.out.println("CableHashCode" + super.hashCode());
            return 130;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Cable) {
                    System.out.println("have ref. will compare..");
                    Cable cable1 = this;
                    Cable cable2 = (Cable) obj;
                    if (cable1.type.equals(cable2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

