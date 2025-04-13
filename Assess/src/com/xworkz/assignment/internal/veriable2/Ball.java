package com.xworkz.assignment.internal.veriable2;

    public class Ball {
        private String color;
        private double size;
        private String material;

        public Ball(String color, double size, String material) {
            this.color = color;
            this.size = size;
            this.material = material;
        }

        @Override
        public String toString() {
            return "Ball{color=" + color + ", size=" + size + "cm, material=" + material + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("BallHashCode:" + super.hashCode());
            return 8745;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Ball) {
                    System.out.println("have ref. will compare..");
                    Ball ball1 = this;
                    Ball ball2 = (Ball) obj;
                    if (ball1.color.equals(ball2.color) && ball1.size == ball2.size && ball1.material.equals(ball2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

