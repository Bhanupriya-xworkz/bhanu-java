package com.xworkz.assignment.internal.veriable;

    public class Apple {
        private String variety;
        private String color;
        private boolean isFresh;

        public Apple() {
            System.out.println("Running no-arg constructor of Apple");
            this.variety = "Fuji";
            this.color = "Red";
            this.isFresh = true;
        }

        @Override
        public String toString() {
            return "Variety: " + variety + ", Color: " + color + ", Is Fresh: " + isFresh;
        }

        @Override
        public int hashCode() {
            System.out.println("AppleHashCode" + super.hashCode());
            return 65;
        }

        public void setVariety(String variety) {
            this.variety = variety;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Apple) {
                    System.out.println("have ref. will compare..");
                    Apple apple1 = this;
                    Apple apple2 = (Apple) obj;
                    if (apple1.variety.equals(apple2.variety)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

