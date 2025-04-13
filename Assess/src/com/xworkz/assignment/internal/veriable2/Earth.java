package com.xworkz.assignment.internal.veriable2;

    public class Earth {
        private double diameter;
        private double mass;
        private boolean hasLife;

        public Earth(double diameter, double mass, boolean hasLife) {
            this.diameter = diameter;
            this.mass = mass;
            this.hasLife = hasLife;
        }

        @Override
        public String toString() {
            return "Earth{diameter=" + diameter + " km, mass=" + mass + " kg, hasLife=" + hasLife + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("EarthHashCode:" + super.hashCode());
            return 8755;
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }

        public void setMass(double mass) {
            this.mass = mass;
        }

        public void setHasLife(boolean hasLife) {
            this.hasLife = hasLife;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Earth) {
                    System.out.println("have ref. will compare..");
                    Earth earth1 = this;
                    Earth earth2 = (Earth) obj;
                    if (earth1.diameter == earth2.diameter && earth1.mass == earth2.mass && earth1.hasLife == earth2.hasLife) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

