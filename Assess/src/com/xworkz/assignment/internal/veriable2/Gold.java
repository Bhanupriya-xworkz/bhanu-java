package com.xworkz.assignment.internal.veriable2;

    public class Gold {
        private double purity;
        private double weight;
        private boolean isAlloy;

        public Gold(double purity, double weight, boolean isAlloy) {
            this.purity = purity;
            this.weight = weight;
            this.isAlloy = isAlloy;
        }

        @Override
        public String toString() {
            return "Gold{purity=" + purity + "%, weight=" + weight + "g, isAlloy=" + isAlloy + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("GoldHashCode: " + super.hashCode());
            return 12345;  // An arbitrary constant for demonstration
        }

        public void setPurity(double purity) {
            this.purity = purity;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setIsAlloy(boolean isAlloy) {
            this.isAlloy = isAlloy;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Gold) {
                    System.out.println("Comparing references...");
                    Gold gold1 = this;
                    Gold gold2 = (Gold) obj;
                    if (gold1.purity == gold2.purity && gold1.weight == gold2.weight && gold1.isAlloy == gold2.isAlloy) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

