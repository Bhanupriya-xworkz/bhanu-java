package com.xworkz.assignment.internal.veriable;

    public class Ball {
        private String sport;
        private String material;
        private boolean isInflated;

        public Ball() {
            System.out.println("Running no-arg constructor of Ball");
            this.sport = "Football";
            this.material = "Leather";
            this.isInflated = true;
        }

        @Override
        public String toString() {
            return "Sport: " + sport + ", Material: " + material + ", Is Inflated: " + isInflated;
        }

        @Override
        public int hashCode() {
            System.out.println("BallHashCode" + super.hashCode());
            return 85;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Ball) {
                    System.out.println("have ref. will compare..");
                    Ball ball1 = this;
                    Ball ball2 = (Ball) obj;
                    if (ball1.sport.equals(ball2.sport)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

