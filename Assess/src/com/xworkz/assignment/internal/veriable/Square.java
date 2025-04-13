package com.xworkz.assignment.internal.veriable;

    public class Square {
        private double sideLength;
        private String color;
        private boolean isFilled;

        public Square() {
            System.out.println("Running no-arg constructor of Square");
            this.sideLength = 5.0;
            this.color = "Blue";
            this.isFilled = true;
        }

        @Override
        public String toString() {
            return "Side Length: " + sideLength + " cm, Color: " + color + ", Is Filled: " + isFilled;
        }

        @Override
        public int hashCode() {
            System.out.println("SquareHashCode" + super.hashCode());
            return 370;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
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
                if (obj instanceof Square) {
                    System.out.println("have ref. will compare..");
                    Square square1 = this;
                    Square square2 = (Square) obj;
                    if (square1.sideLength == square2.sideLength && square1.color.equals(square2.color)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

