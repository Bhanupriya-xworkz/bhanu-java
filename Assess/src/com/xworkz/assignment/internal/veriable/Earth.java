package com.xworkz.assignment.internal.veriable;

    public class Earth {
        private String continent;
        private double area;
        private boolean isHabitable;

        public Earth() {
            System.out.println("Running no-arg constructor of Earth");
            this.continent = "Asia";
            this.area = 44000000.0;
            this.isHabitable = true;
        }

        @Override
        public String toString() {
            return "Continent: " + continent + ", Area: " + area + " km², Is Habitable: " + isHabitable;
        }

        @Override
        public int hashCode() {
            System.out.println("EarthHashCode" + super.hashCode());
            return 200;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Earth) {
                    System.out.println("have ref. will compare..");
                    Earth earth1 = this;
                    Earth earth2 = (Earth) obj;
                    if (earth1.continent.equals(earth2.continent)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

