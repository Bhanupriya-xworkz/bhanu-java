package com.xworkz.assignment.internal.veriable;

    public class Fiber {
        private String material;
        private double length;
        private boolean isSynthetic;

        public Fiber() {
            System.out.println("Running no-arg constructor of Fiber");
            this.material = "Polyester";
            this.length = 100.0;
            this.isSynthetic = true;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Length: " + length + " meters, Is Synthetic: " + isSynthetic;
        }

        @Override
        public int hashCode() {
            System.out.println("FiberHashCode" + super.hashCode());
            return 300;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Fiber) {
                    System.out.println("have ref. will compare..");
                    Fiber fiber1 = this;
                    Fiber fiber2 = (Fiber) obj;
                    if (fiber1.material.equals(fiber2.material)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

