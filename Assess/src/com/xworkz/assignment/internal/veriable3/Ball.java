package com.xworkz.assignment.internal.veriable3;

    public class Ball {
        private String type;
        private double diameter;
        private boolean isInflated;

        public Ball() {
            System.out.println("running non-arg constructor Ball");
            System.out.println("diameter: " + this.diameter);
            this.diameter = 0.0;
            this.type = "Soccer";
            this.isInflated = true;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Diameter: " + diameter + " inches, Inflated: " + isInflated;
        }

        @Override
        public int hashCode() {
            System.out.println("BallHashCode: " + super.hashCode());
            return 1010;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }

        public void setInflated(boolean isInflated) {
            this.isInflated = isInflated;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Ball ball1 = this;
                Ball ball2 = (Ball) obj;
                if (obj instanceof Ball) {
                    System.out.println("have ref. will compare..");
                    if (ball1.isInflated == ball2.isInflated) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

