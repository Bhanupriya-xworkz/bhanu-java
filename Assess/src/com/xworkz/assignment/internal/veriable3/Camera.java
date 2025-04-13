package com.xworkz.assignment.internal.veriable3;

public class Camera {
        private String brand;
        private int megapixels;
        private boolean isDigital;

        // Constructor
        public Camera() {
            System.out.println("running non-arg constructor Camera");
            System.out.println("brand: " + this.brand);
            this.brand = "Canon";
            this.megapixels = 12;
            this.isDigital = true;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Megapixels: " + megapixels + " MP, Digital: " + isDigital;
        }

        @Override
        public int hashCode() {
            System.out.println("CameraHashCode: " + super.hashCode());
            return 8080; // Arbitrary hash code
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setMegapixels(int megapixels) {
            this.megapixels = megapixels;
        }

        public void setIsDigital(boolean isDigital) {
            this.isDigital = isDigital;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Camera camera1 = this;
                Camera camera2 = (Camera) obj;
                if (obj instanceof Camera) {
                    System.out.println("have ref. will compare..");
                    if (camera1.brand.equals(camera2.brand) && camera1.megapixels == camera2.megapixels && camera1.isDigital == camera2.isDigital) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

