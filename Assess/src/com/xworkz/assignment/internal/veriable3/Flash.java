package com.xworkz.assignment.internal.veriable3;

    public class Flash {
        private String color;
        private double speed;
        private boolean isVisible;

        public Flash() {
            System.out.println("Running non-arg constructor Flash");
            System.out.println("color: " + this.color);
            this.color = "Red";
            this.speed = 299792458;
            this.isVisible = true;
        }

        @Override
        public String toString() {
            return "Color: " + color + ", Speed: " + speed + ", IsVisible: " + isVisible;
        }

        @Override
        public int hashCode() {
            System.out.println("FlashHashCode: " + super.hashCode());
            return 9999;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public void setVisible(boolean isVisible) {
            this.isVisible = isVisible;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Flash) {
                    System.out.println("Have reference. Will compare...");
                    Flash f1 = this;
                    Flash f2 = (Flash) obj;
                    if (f1.color.equals(f2.color) && f1.speed == f2.speed && f1.isVisible == f2.isVisible) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

