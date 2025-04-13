package com.xworkz.assignment.internal.veriable2;

    public class Phone {
        private String brand;
        private String model;
        private boolean isSmartphone;

        public Phone(String brand, String model, boolean isSmartphone) {
            this.brand = brand;
            this.model = model;
            this.isSmartphone = isSmartphone;
        }

        @Override
        public String toString() {
            return "Phone{brand='" + brand + "', model='" + model + "', isSmartphone=" + isSmartphone + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("PhoneHashCode: " + super.hashCode());
            return 2121;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setIsSmartphone(boolean isSmartphone) {
            this.isSmartphone = isSmartphone;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Phone) {
                    System.out.println("Comparing Phone objects...");
                    Phone p1 = this;
                    Phone p2 = (Phone) obj;
                    if (p1.brand.equals(p2.brand) && p1.model.equals(p2.model) && p1.isSmartphone == p2.isSmartphone) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

