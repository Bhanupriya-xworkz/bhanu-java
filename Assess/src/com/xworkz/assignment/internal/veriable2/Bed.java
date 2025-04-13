package com.xworkz.assignment.internal.veriable2;

    public class Bed {
        private String size;
        private String material;
        private boolean hasHeadboard;

        public Bed(String size, String material, boolean hasHeadboard) {
            this.size = size;
            this.material = material;
            this.hasHeadboard = hasHeadboard;
        }

        @Override
        public String toString() {
            return "Bed{size=" + size + ", material=" + material + ", hasHeadboard=" + hasHeadboard + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("BedHashCode:" + super.hashCode());
            return 8746;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setHasHeadboard(boolean hasHeadboard) {
            this.hasHeadboard = hasHeadboard;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Bed) {
                    System.out.println("have ref. will compare..");
                    Bed bed1 = this;
                    Bed bed2 = (Bed) obj;
                    if (bed1.size.equals(bed2.size) && bed1.material.equals(bed2.material) && bed1.hasHeadboard == bed2.hasHeadboard) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

