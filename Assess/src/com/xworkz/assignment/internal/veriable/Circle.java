package com.xworkz.assignment.internal.veriable;

    public class Circle {
        private double radius;
        private String color;
        private boolean isFilled;

        public Circle() {
            System.out.println("Running no-arg constructor of Circle");
            this.radius = 5.0;
            this.color = "Red";
            this.isFilled = true;
        }

        @Override
        public String toString() {
            return "Radius: " + radius + " cm, Color: " + color + ", Is Filled: " + isFilled;
        }

        @Override
        public int hashCode() {
            System.out.println("CircleHashCode" + super.hashCode());
            return 360;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setFilled(boolean isFilled) {
            this.isFilled = isFilled;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Circle) {
                    System.out.println("have ref. will compare..");
                    Circle circle1 = this;
                    Circle circle2 = (Circle) obj;
                    if (circle1.radius == circle2.radius && circle1.color.equals(circle2.color)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

