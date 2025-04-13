package com.xworkz.assignment.internal.veriable;

    public class Phone {
        private String brand;
        private String model;
        private boolean isSmartphone;

        public Phone() {
            System.out.println("Running no-arg constructor of Phone");
            this.brand = "Samsung";
            this.model = "Galaxy S21";
            this.isSmartphone = true;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Model: " + model + ", Is Smartphone: " + isSmartphone;
        }

        @Override
        public int hashCode() {
            System.out.println("PhoneHashCode" + super.hashCode());
            return 95;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Phone) {
                    System.out.println("have ref. will compare..");
                    Phone phone1 = this;
                    Phone phone2 = (Phone) obj;
                    if (phone1.brand.equals(phone2.brand)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }


