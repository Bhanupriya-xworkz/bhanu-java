package com.xworkz.assignment.internal.veriable3;

public class Forward {
        private String direction;
        private int speed;
        private boolean isActive;

        public Forward() {
            System.out.println("Running non-arg constructor Forward");
            System.out.println("direction: " + this.direction);
            this.direction = "North";
            this.speed = 10;
            this.isActive = true;
        }

        @Override
        public String toString() {
            return "Direction: " + direction + ", Speed: " + speed + ", Active: " + isActive;
        }

        @Override
        public int hashCode() {
            System.out.println("ForwardHashCode: " + super.hashCode());
            return 777;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setActive(boolean isActive) {
            this.isActive = isActive;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Forward) {
                    System.out.println("Have reference. Will compare...");
                    Forward f1 = this;
                    Forward f2 = (Forward) obj;
                    if (f1.direction.equals(f2.direction) &&
                            f1.speed == f2.speed &&
                            f1.isActive == f2.isActive) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
}
