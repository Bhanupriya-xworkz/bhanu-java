package com.xworkz.assignment.internal.veriable3;

    public class Door {
        private String material;
        private double height;
        private double width;
        private boolean isOpen;

        public Door() {
            System.out.println("running non-arg constructor Door");
            System.out.println("material: " + this.material);
            this.material = "Wood";
            this.height = 7.0;  // Default height in feet
            this.width = 3.0;   // Default width in feet
            this.isOpen = false; // Door is closed by default
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Height: " + height + " feet, Width: " + width + " feet, Is Open: " + isOpen;
        }

        @Override
        public int hashCode() {
            System.out.println("DoorHashCode: " + super.hashCode());
            return 7890; // Arbitrary hash code
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setOpen(boolean isOpen) {
            this.isOpen = isOpen;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Door door1 = this;
                Door door2 = (Door) obj;
                if (obj instanceof Door) {
                    System.out.println("have ref. will compare..");
                    if (door1.material.equals(door2.material) && door1.height == door2.height && door1.width == door2.width && door1.isOpen == door2.isOpen) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

