package com.xworkz.assignment.internal.veriable2;

    public class Leaf {
        private String color;
        private double size;
        private String type;

        public Leaf(String color, double size, String type) {
            this.color = color;
            this.size = size;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Leaf{color='" + color + "', size=" + size + ", type='" + type + "'}";
        }

        @Override
        public int hashCode() {
            System.out.println("LeafHashCode: " + super.hashCode());
            return 12345;  // An arbitrary hash code value for demonstration
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Leaf) {
                    System.out.println("Comparing references...");
                    Leaf leaf1 = this;
                    Leaf leaf2 = (Leaf) obj;
                    if (leaf1.color.equals(leaf2.color) && leaf1.size == leaf2.size && leaf1.type.equals(leaf2.type)) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

