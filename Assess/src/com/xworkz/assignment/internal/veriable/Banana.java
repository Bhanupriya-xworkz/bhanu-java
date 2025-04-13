package com.xworkz.assignment.internal.veriable;

    public class Banana {
        private String type;
        private String origin;
        private boolean isRipe;

        public Banana() {
            System.out.println("Running no-arg constructor of Banana");
            this.type = "Cavendish";
            this.origin = "India";
            this.isRipe = true;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Origin: " + origin + ", Is Ripe: " + isRipe;
        }

        @Override
        public int hashCode() {
            System.out.println("BananaHashCode" + super.hashCode());
            return 75;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Banana) {
                    System.out.println("have ref. will compare..");
                    Banana banana1 = this;
                    Banana banana2 = (Banana) obj;
                    if (banana1.type.equals(banana2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

