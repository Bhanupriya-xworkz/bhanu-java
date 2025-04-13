package com.xworkz.assignment.internal.veriable2;

    public class Banana {
        private String color;
        private double length; // in centimeters
        private boolean isRipe;

        public Banana(String color, double length, boolean isRipe) {
            this.color = color;
            this.length = length;
            this.isRipe = isRipe;
        }

        @Override
        public String toString() {
            return "Banana{color=" + color + ", length=" + length + "cm, isRipe=" + isRipe + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("BananaHashCode:" + super.hashCode());
            return 8744;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setRipe(boolean isRipe) {
            this.isRipe = isRipe;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Banana) {
                    System.out.println("have ref. will compare..");
                    Banana banana1 = this;
                    Banana banana2 = (Banana) obj;
                    if (banana1.color.equals(banana2.color) && banana1.isRipe == banana2.isRipe) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

