package com.xworkz.assignment.internal.veriable2;

    public class Plastic {
        private String type;
        private boolean isRecyclable;
        private String color;

        public Plastic(String type, boolean isRecyclable, String color) {
            this.type = type;
            this.isRecyclable = isRecyclable;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Plastic{type='" + type + "', isRecyclable=" + isRecyclable + ", color='" + color + "'}";
        }

        @Override
        public int hashCode() {
            System.out.println("PlasticHashCode: " + super.hashCode());
            return 6060;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setRecyclable(boolean recyclable) {
            isRecyclable = recyclable;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Plastic) {
                    System.out.println("Comparing Plastic objects...");
                    Plastic p1 = this;
                    Plastic p2 = (Plastic) obj;
                    if (p1.type.equals(p2.type) && p1.isRecyclable == p2.isRecyclable && p1.color.equals(p2.color)) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

