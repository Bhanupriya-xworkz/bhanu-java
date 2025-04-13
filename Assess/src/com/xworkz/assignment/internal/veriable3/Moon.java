package com.xworkz.assignment.internal.veriable3;

    public class Moon {
        private String name;
        private double size;
        private boolean hasRings;

        public Moon() {
            System.out.println("Running non-arg constructor Moon");
            System.out.println("name: " + this.name);
            this.name = "Luna";
            this.size = 3474.8;
            this.hasRings = false;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Size: " + size + " km, Has Rings: " + hasRings;
        }

        @Override
        public int hashCode() {
            System.out.println("MoonHashCode: " + super.hashCode());
            return 2022;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void setHasRings(boolean hasRings) {
            this.hasRings = hasRings;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Moon) {
                    System.out.println("Have reference. Will compare...");
                    Moon m1 = this;
                    Moon m2 = (Moon) obj;
                    if (m1.name.equals(m2.name) &&
                            m1.size == m2.size &&
                            m1.hasRings == m2.hasRings) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

