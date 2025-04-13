package com.xworkz.assignment.internal.veriable;

public class Gold {
        private String type;
        private double weight;
        private boolean isPure;

        public Gold() {
            System.out.println("Running no-arg constructor of Gold");
            this.type = "24K";
            this.weight = 10.5;
            this.isPure = true;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Weight: " + weight + "g, Is Pure: " + isPure;
        }

        @Override
        public int hashCode() {
            System.out.println("GoldHashCode" + super.hashCode());
            return 35;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Gold) {
                    System.out.println("have ref. will compare..");
                    Gold gold1 = this;
                    Gold gold2 = (Gold) obj;
                    if (gold1.type.equals(gold2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

