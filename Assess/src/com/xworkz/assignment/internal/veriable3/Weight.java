package com.xworkz.assignment.internal.veriable3;

    public class Weight {
        private double value;
        private String unit;
        private boolean isMeasured;

        public Weight() {
            System.out.println("Running non-arg constructor Weight");
            System.out.println("value: " + this.value);
            this.value = 60.0;
            this.unit = "kg";
            this.isMeasured = true;
        }

        @Override
        public String toString() {
            return "Value: " + value + ", Unit: " + unit + ", IsMeasured: " + isMeasured;
        }

        @Override
        public int hashCode() {
            System.out.println("WeightHashCode: " + super.hashCode());
            return 5050;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public void setMeasured(boolean isMeasured) {
            this.isMeasured = isMeasured;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Weight) {
                    System.out.println("Have reference. Will compare...");
                    Weight w1 = this;
                    Weight w2 = (Weight) obj;
                    if (w1.value == w2.value && w1.unit.equals(w2.unit) && w1.isMeasured == w2.isMeasured) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

