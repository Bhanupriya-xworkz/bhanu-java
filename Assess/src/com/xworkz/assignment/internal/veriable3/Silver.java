package com.xworkz.assignment.internal.veriable3;

    public class Silver {
        private double weight;
        private double purity;
        private boolean isPolished;


        public Silver() {
            System.out.println("running non-arg constructor Silver");
            System.out.println("weight: " + this.weight);
            this.weight = 50.0;
            this.purity = 92.5;
            this.isPolished = true;
        }

        @Override
        public String toString() {
            return "Weight: " + weight + "g, Purity: " + purity + "%, Is Polished: " + isPolished;
        }

        @Override
        public int hashCode() {
            System.out.println("SilverHashCode: " + super.hashCode());
            return 6789;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setPurity(double purity) {
            this.purity = purity;
        }

        public void setPolished(boolean isPolished) {
            this.isPolished = isPolished;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Silver silver1 = this;
                Silver silver2 = (Silver) obj;
                if (obj instanceof Silver) {
                    System.out.println("have ref. will compare..");
                    if (silver1.weight == silver2.weight && silver1.purity == silver2.purity && silver1.isPolished == silver2.isPolished) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

