package com.xworkz.assignment.internal.veriable;

    public class Sheet {
        private String material;
        private double size;
        private boolean isWaterproof;

        public Sheet() {
            System.out.println("Running no-arg constructor of Sheet");
            this.material = "Cotton";
            this.size = 2.0;
            this.isWaterproof = false;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Size: " + size + " m², Is Waterproof: " + isWaterproof;
        }

        @Override
        public int hashCode() {
            System.out.println("SheetHashCode" + super.hashCode());
            return 240;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Sheet) {
                    System.out.println("have ref. will compare..");
                    Sheet sheet1 = this;
                    Sheet sheet2 = (Sheet) obj;
                    if (sheet1.material.equals(sheet2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

