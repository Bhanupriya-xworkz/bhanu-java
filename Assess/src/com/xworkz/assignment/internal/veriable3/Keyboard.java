package com.xworkz.assignment.internal.veriable3;

    public class Keyboard {
        private String type;
        private String brand;
        private boolean isWireless;

        public Keyboard() {
            System.out.println("Running non-arg constructor Keyboard");
            System.out.println("type: " + this.type);
            this.type = "Mechanical";
            this.brand = "Logitech";
            this.isWireless = false;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Brand: " + brand + ", Is Wireless: " + isWireless;
        }

        @Override
        public int hashCode() {
            System.out.println("KeyboardHashCode: " + super.hashCode());
            return 1234;  // Arbitrary hash code
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setWireless(boolean isWireless) {
            this.isWireless = isWireless;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Keyboard keyboard1 = this;
                Keyboard keyboard2 = (Keyboard) obj;
                if (obj instanceof Keyboard) {
                    System.out.println("have ref. will compare..");
                    if (keyboard1.type.equals(keyboard2.type) && keyboard1.brand.equals(keyboard2.brand) && keyboard1.isWireless == keyboard2.isWireless) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

