package com.xworkz.assignment.internal.veriable2;

    public class Window {
        private String shape;
        private String material;
        private boolean isOpenable;

        public Window(String shape, String material, boolean isOpenable) {
            this.shape = shape;
            this.material = material;
            this.isOpenable = isOpenable;
        }

        @Override
        public String toString() {
            return "Window{shape='" + shape + "', material='" + material + "', isOpenable=" + isOpenable + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("WindowHashCode: " + super.hashCode());
            return 2024; // Arbitrary hash code
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setIsOpenable(boolean isOpenable) {
            this.isOpenable = isOpenable;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Window) {
                    System.out.println("Comparing Window objects...");
                    Window w1 = this;
                    Window w2 = (Window) obj;
                    if (w1.shape.equals(w2.shape) && w1.material.equals(w2.material) && w1.isOpenable == w2.isOpenable) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

