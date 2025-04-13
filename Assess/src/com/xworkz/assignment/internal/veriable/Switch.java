package com.xworkz.assignment.internal.veriable;

    public class Switch {
        private String brand;
        private int numberOfButtons;
        private boolean isSmart;

        public Switch() {
            System.out.println("Running no-arg constructor of Switch");
            this.brand = "Philips";
            this.numberOfButtons = 3;
            this.isSmart = false;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Number of Buttons: " + numberOfButtons + ", Is Smart: " + isSmart;
        }

        @Override
        public int hashCode() {
            System.out.println("SwitchHashCode" + super.hashCode());
            return 45;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Switch) {
                    System.out.println("have ref. will compare..");
                    Switch switch1 = this;
                    Switch switch2 = (Switch) obj;
                    if (switch1.brand.equals(switch2.brand)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

