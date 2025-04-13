package com.xworkz.assignment.internal.veriable3;

    public class Water {
        private double volume;
        private String color;
        private boolean isDrinkable;

        public Water() {
            System.out.println("Running non-arg constructor Water");
            System.out.println("volume: " + this.volume);
            this.volume = 1.0;
            this.color = "Clear";
            this.isDrinkable = true;
        }

        @Override
        public String toString() {
            return "Volume: " + volume + "L, Color: " + color + ", Is Drinkable: " + isDrinkable;
        }

        @Override
        public int hashCode() {
            System.out.println("WaterHashCode: " + super.hashCode());
            return 9876;  // Arbitrary hash code
        }


        public void setVolume(double volume) {
            this.volume = volume;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setDrinkable(boolean isDrinkable) {
            this.isDrinkable = isDrinkable;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Water water1 = this;
                Water water2 = (Water) obj;
                if (obj instanceof Water) {
                    System.out.println("have ref. will compare..");
                    if (water1.volume == water2.volume && water1.color.equals(water2.color) && water1.isDrinkable == water2.isDrinkable) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

