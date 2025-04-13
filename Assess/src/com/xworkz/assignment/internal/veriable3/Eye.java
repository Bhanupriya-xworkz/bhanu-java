package com.xworkz.assignment.internal.veriable3;

    public class Eye {
        private String color;
        private double size;
        private boolean isHealthy;

        public Eye() {
            System.out.println("running non-arg constructor Eye");
            System.out.println("color: " + this.color);
            this.color = "Brown";
            this.size = 2.5; // Default size in centimeters
            this.isHealthy = true; // Default is healthy
        }

        @Override
        public String toString() {
            return "Color: " + color + ", Size: " + size + " cm, Is Healthy: " + isHealthy;
        }

        @Override
        public int hashCode() {
            System.out.println("EyeHashCode: " + super.hashCode());
            return 5678; // Arbitrary hash code
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void setIsHealthy(boolean isHealthy) {
            this.isHealthy = isHealthy;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Eye eye1 = this;
                Eye eye2 = (Eye) obj;
                if (obj instanceof Eye) {
                    System.out.println("have ref. will compare..");
                    if (eye1.color.equals(eye2.color) && eye1.size == eye2.size && eye1.isHealthy == eye2.isHealthy) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

