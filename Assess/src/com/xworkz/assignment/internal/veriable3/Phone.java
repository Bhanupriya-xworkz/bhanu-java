package com.xworkz.assignment.internal.veriable3;

    public class Phone {
        private String brand;
        private String model;
        private boolean isSmart;

        public Phone() {
            System.out.println("Running non-arg constructor Phone");
            System.out.println("brand: " + this.brand);
            this.brand = "Apple";
            this.model = "iPhone 12";
            this.isSmart = true;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Model: " + model + ", Is Smart: " + isSmart;
        }

        @Override
        public int hashCode() {
            System.out.println("PhoneHashCode: " + super.hashCode());
            return 5678;  // Arbitrary hash code
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setSmart(boolean isSmart) {
            this.isSmart = isSmart;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Phone phone1 = this;
                Phone phone2 = (Phone) obj;
                if (obj instanceof Phone) {
                    System.out.println("have ref. will compare..");
                    if (phone1.brand.equals(phone2.brand) && phone1.model.equals(phone2.model) && phone1.isSmart == phone2.isSmart) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

