package com.xworkz.assignment.internal.veriable3;

    public class Amount {
        private double value;
        private String currency;

        public Amount() {
            System.out.println("running non-arg constructor Amount");
            System.out.println("value: " + this.value);
            this.value = 0.0;
            this.currency = "USD";
        }

        @Override
        public String toString() {
            return "Value: " + value + " " + currency;
        }

        @Override
        public int hashCode() {
            System.out.println("AmountHashCode: " + super.hashCode());
            return 54321;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Amount amount1 = this;
                Amount amount2 = (Amount) obj;
                if (obj instanceof Amount) {
                    System.out.println("have ref. will compare..");
                    if (amount1.value == amount2.value && amount1.currency.equals(amount2.currency)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

