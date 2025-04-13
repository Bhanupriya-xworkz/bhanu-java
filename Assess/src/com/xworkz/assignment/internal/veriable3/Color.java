package com.xworkz.assignment.internal.veriable3;

    public class Color {
        private String name;
        private String hexCode;
        private boolean isPrimary;

        public Color() {
            System.out.println("Running non-arg constructor Color");
            System.out.println("name: " + this.name);
            this.name = "Red";
            this.hexCode = "#FF0000";
            this.isPrimary = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", HexCode: " + hexCode + ", Is Primary: " + isPrimary;
        }

        @Override
        public int hashCode() {
            System.out.println("ColorHashCode: " + super.hashCode());
            return 5678;  // Arbitrary hash code
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHexCode(String hexCode) {
            this.hexCode = hexCode;
        }

        public void setPrimary(boolean isPrimary) {
            this.isPrimary = isPrimary;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Color color1 = this;
                Color color2 = (Color) obj;
                if (obj instanceof Color) {
                    System.out.println("have ref. will compare..");
                    if (color1.name.equals(color2.name) && color1.hexCode.equals(color2.hexCode) && color1.isPrimary == color2.isPrimary) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

