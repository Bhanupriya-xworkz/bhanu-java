package com.xworkz.assignment.internal.veriable2;

    public class Mountain {
        private String name;
        private double height;
        private String location;

        public Mountain(String name, double height, String location) {
            this.name = name;
            this.height = height;
            this.location = location;
        }

        @Override
        public String toString() {
            return "Mountain{name='" + name + "', height=" + height + ", location='" + location + "'}";
        }

        @Override
        public int hashCode() {
            System.out.println("MountainHashCode: " + super.hashCode());
            return 54321;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Mountain) {
                    System.out.println("Comparing references...");
                    Mountain mountain1 = this;
                    Mountain mountain2 = (Mountain) obj;
                    if (mountain1.name.equals(mountain2.name) && mountain1.height == mountain2.height && mountain1.location.equals(mountain2.location)) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

