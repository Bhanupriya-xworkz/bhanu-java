package com.xworkz.assignment.internal.veriable;

    public class Window {
        private String material;
        private String type;
        private boolean isTinted;

        public Window() {
            System.out.println("Running no-arg constructor of Window");
            this.material = "Glass";
            this.type = "Casement";
            this.isTinted = false;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Type: " + type + ", Is Tinted: " + isTinted;
        }

        @Override
        public int hashCode() {
            System.out.println("WindowHashCode" + super.hashCode());
            return 250;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Window) {
                    System.out.println("have ref. will compare..");
                    Window window1 = this;
                    Window window2 = (Window) obj;
                    if (window1.material.equals(window2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

