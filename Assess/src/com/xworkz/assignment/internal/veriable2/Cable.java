package com.xworkz.assignment.internal.veriable2;

    public class Cable {
        private String type;
        private double length;
        private boolean isDamaged;

        public Cable(String type, double length, boolean isDamaged) {
            this.type = type;
            this.length = length;
            this.isDamaged = isDamaged;
        }

        @Override
        public String toString() {
            return "Cable{type=" + type + ", length=" + length + " meters, isDamaged=" + isDamaged + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("CableHashCode:" + super.hashCode());
            return 8750;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setDamaged(boolean isDamaged) {
            this.isDamaged = isDamaged;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Cable) {
                    System.out.println("have ref. will compare..");
                    Cable cable1 = this;
                    Cable cable2 = (Cable) obj;
                    if (cable1.type.equals(cable2.type) && cable1.length == cable2.length && cable1.isDamaged == cable2.isDamaged) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

