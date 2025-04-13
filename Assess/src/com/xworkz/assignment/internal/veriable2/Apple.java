package com.xworkz.assignment.internal.veriable2;

public class Apple {
        private String color;
        private double weight;
        private boolean isSweet;

        public Apple(String color, double weight, boolean isSweet) {
            this.color = color;
            this.weight = weight;
            this.isSweet = isSweet;
        }

        @Override
        public String toString() {
            return "Apple{color=" + color + ", weight=" + weight + ", isSweet=" + isSweet + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("AppleHashCode:" + super.hashCode());
            return 8743;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSweet(boolean isSweet) {
            this.isSweet = isSweet;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Apple) {
                    System.out.println("have ref. will compare..");
                    Apple apple1 = this;
                    Apple apple2 = (Apple) obj;
                    if (apple1.color.equals(apple2.color) && apple1.isSweet == apple2.isSweet) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

