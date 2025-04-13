package com.xworkz.assignment.internal.veriable;

    public class Silver {
        private String purity;
        private double weight;
        private boolean isPolished;

        public Silver() {
            System.out.println("Running no-arg constructor of Silver");
            this.purity = "92.5%";
            this.weight = 50.0;
            this.isPolished = true;
        }

        @Override
        public String toString() {
            return "Purity: " + purity + ", Weight: " + weight + "g, Is Polished: " + isPolished;
        }

        @Override
        public int hashCode() {
            System.out.println("SilverHashCode" + super.hashCode());
            return 230;
        }

        public void setPurity(String purity) {
            this.purity = purity;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Silver) {
                    System.out.println("have ref. will compare..");
                    Silver silver1 = this;
                    Silver silver2 = (Silver) obj;
                    if (silver1.purity.equals(silver2.purity)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

