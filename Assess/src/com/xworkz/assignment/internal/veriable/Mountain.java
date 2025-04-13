package com.xworkz.assignment.internal.veriable;

    public class Mountain {
        private String name;
        private double height; // in meters
        private boolean isActiveVolcano;

        public Mountain() {
            System.out.println("Running no-arg constructor of Mountain");
            this.name = "Mount Everest";
            this.height = 8848.86; // Default height in meters (Mount Everest)
            this.isActiveVolcano = false;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Height: " + height + " meters, Is Active Volcano: " + isActiveVolcano;
        }

        @Override
        public int hashCode() {
            System.out.println("MountainHashCode" + super.hashCode());
            return 270;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Mountain) {
                    System.out.println("have ref. will compare..");
                    Mountain mountain1 = this;
                    Mountain mountain2 = (Mountain) obj;
                    if (mountain1.name.equals(mountain2.name)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

