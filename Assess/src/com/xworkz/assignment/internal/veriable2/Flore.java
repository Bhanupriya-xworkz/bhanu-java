package com.xworkz.assignment.internal.veriable2;

public class Flore {
        private String name;
        private String color;
        private boolean isFragrant;

        public Flore(String name, String color, boolean isFragrant) {
            this.name = name;
            this.color = color;
            this.isFragrant = isFragrant;
        }

        @Override
        public String toString() {
            return "Flore{name=" + name + ", color=" + color + ", isFragrant=" + isFragrant + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("FloreHashCode:" + super.hashCode());
            return 8760;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setIsFragrant(boolean isFragrant) {
            this.isFragrant = isFragrant;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Flore) {
                    System.out.println("have ref. will compare..");
                    Flore flore1 = this;
                    Flore flore2 = (Flore) obj;
                    if (flore1.name.equals(flore2.name) && flore1.color.equals(flore2.color) && flore1.isFragrant == flore2.isFragrant) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

