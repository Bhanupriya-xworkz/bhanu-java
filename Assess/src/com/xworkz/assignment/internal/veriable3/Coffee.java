package com.xworkz.assignment.internal.veriable3;

    public class Coffee {
        private String type;
        private String size;
        private boolean isHot;

        public Coffee() {
            System.out.println("running non-arg constructor Coffee");
            System.out.println("type: " + this.type);
            this.type = "Espresso";
            this.size = "Medium";
            this.isHot = true;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Size: " + size + ", Hot: " + isHot;
        }

        @Override
        public int hashCode() {
            System.out.println("CoffeeHashCode: " + super.hashCode());
            return 3030; // Arbitrary hash code
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setHot(boolean isHot) {
            this.isHot = isHot;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Coffee coffee1 = this;
                Coffee coffee2 = (Coffee) obj;
                if (obj instanceof Coffee) {
                    System.out.println("have ref. will compare..");
                    if (coffee1.isHot == coffee2.isHot) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

