package com.xworkz.assignment.internal.veriable3;

    public class Number {
        private int value;
        private String type;
        private boolean isPositive;

        public Number() {
            System.out.println("Running non-arg constructor Number");
            System.out.println("value: " + this.value);
            this.value = 10;
            this.type = "Integer";
            this.isPositive = true;
        }

        @Override
        public String toString() {
            return "Value: " + value + ", Type: " + type + ", IsPositive: " + isPositive;
        }

        @Override
        public int hashCode() {
            System.out.println("NumberHashCode: " + super.hashCode());
            return 2025;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPositive(boolean isPositive) {
            this.isPositive = isPositive;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Number) {
                    System.out.println("Have reference. Will compare...");
                    Number n1 = this;
                    Number n2 = (Number) obj;
                    if (n1.value == n2.value && n1.type.equals(n2.type) && n1.isPositive == n2.isPositive) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

