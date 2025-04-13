package com.xworkz.assignment.internal.veriable2;

    public class Sheet {
        private String material;
        private String size;
        private boolean isFoldable;

        public Sheet(String material, String size, boolean isFoldable) {
            this.material = material;
            this.size = size;
            this.isFoldable = isFoldable;
        }

        @Override
        public String toString() {
            return "Sheet{material='" + material + "', size='" + size + "', isFoldable=" + isFoldable + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("SheetHashCode: " + super.hashCode());
            return 4444; // Arbitrary hash code
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setFoldable(boolean foldable) {
            isFoldable = foldable;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Sheet) {
                    System.out.println("Comparing Sheet objects...");
                    Sheet s1 = this;
                    Sheet s2 = (Sheet) obj;
                    if (s1.material.equals(s2.material) && s1.size.equals(s2.size) && s1.isFoldable == s2.isFoldable) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

