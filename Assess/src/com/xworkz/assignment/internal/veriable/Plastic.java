package com.xworkz.assignment.internal.veriable;

public class Plastic {
        private String type;
        private double weight;
        private boolean isBiodegradable;

        public Plastic() {
            System.out.println("Running no-arg constructor of Plastic");
            this.type = "Polyethylene";
            this.weight = 100.0;
            this.isBiodegradable = false;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Weight: " + weight + "g, Is Biodegradable: " + isBiodegradable;
        }

        @Override
        public int hashCode() {
            System.out.println("PlasticHashCode" + super.hashCode());
            return 290;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Plastic) {
                    System.out.println("have ref. will compare..");
                    Plastic plastic1 = this;
                    Plastic plastic2 = (Plastic) obj;
                    if (plastic1.type.equals(plastic2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

