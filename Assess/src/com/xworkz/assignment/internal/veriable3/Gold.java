package com.xworkz.assignment.internal.veriable3;

    public class Gold {
        private double weight;
        private double purity;
        private boolean isStamped;

        public Gold() {
            System.out.println("running non-arg constructor Gold");
            System.out.println("weight: " + this.weight);
            this.weight = 100.0;
            this.purity = 24.0;
            this.isStamped = true;
        }

        @Override
        public String toString() {
            return "Weight: " + weight + "g, Purity: " + purity + "k, Is Stamped: " + isStamped;
        }

        @Override
        public int hashCode() {
            System.out.println("GoldHashCode: " + super.hashCode());
            return 12345; // Arbitrary hash code
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setPurity(double purity) {
            this.purity = purity;
        }

        public void setStamped(boolean isStamped) {
            this.isStamped = isStamped;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Gold gold1 = this;
                Gold gold2 = (Gold) obj;
                if (obj instanceof Gold) {
                    System.out.println("have ref. will compare..");
                    if (gold1.weight == gold2.weight && gold1.purity == gold2.purity && gold1.isStamped == gold2.isStamped) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

