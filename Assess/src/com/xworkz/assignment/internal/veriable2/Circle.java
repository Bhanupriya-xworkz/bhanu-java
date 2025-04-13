package com.xworkz.assignment.internal.veriable2;

    public class Circle {
        private double radius;  // in centimeters
        private String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Circle{radius=" + radius + " cm, color=" + color + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("CircleHashCode:" + super.hashCode());
            return 8752;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
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

