package com.xworkz.assignment.internal.veriable2;

    public class Fiber {
        private String material;
        private double length;
        private boolean isRecyclable;

        public Fiber(String material, double length, boolean isRecyclable) {
            this.material = material;
            this.length = length;
            this.isRecyclable = isRecyclable;
        }

        @Override
        public String toString() {
            return "Fiber{material=" + material + ", length=" + length + " meters, isRecyclable=" + isRecyclable + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("FiberHashCode:" + super.hashCode());
            return 8756;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setIsRecyclable(boolean isRecyclable) {
            this.isRecyclable = isRecyclable;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Fiber) {
                    System.out.println("have ref. will compare..");
                    Fiber fiber1 = this;
                    Fiber fiber2 = (Fiber) obj;
                    if (fiber1.material.equals(fiber2.material) && fiber1.length == fiber2.length && fiber1.isRecyclable == fiber2.isRecyclable) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

