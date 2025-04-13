package com.xworkz.assignment.internal.veriable3;

public class Window {
        private String material;
        private double size;
        private boolean isOpen;

        public Window(){
            System.out.println("Running non-arg constructor Window");
            System.out.println("material: " + this.material);
            this.material = "Glass";
            this.size = 120.0;
            this.isOpen = false;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Size: " + size + " cm, Is Open: " + isOpen;
        }

        @Override
        public int hashCode() {
            System.out.println("WindowHashCode: " + super.hashCode());
            return 786;  // Arbitrary hash code
        }

        // Setters
        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public void setOpen(boolean isOpen) {
            this.isOpen = isOpen;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Window window1 = this;
                Window window2 = (Window) obj;
                if (obj instanceof Window) {
                    System.out.println("have ref. will compare..");
                    if (window1.material.equals(window2.material) && window1.size == window2.size && window1.isOpen == window2.isOpen) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

