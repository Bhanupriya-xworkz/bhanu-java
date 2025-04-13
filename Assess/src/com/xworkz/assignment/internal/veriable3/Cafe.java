package com.xworkz.assignment.internal.veriable3;

public class Cafe {
        private String name;
        private String location;
        private boolean hasWiFi;

        public Cafe() {
            System.out.println("running non-arg constructor Cafe");
            System.out.println("name: " + this.name);
            this.name = "Starbucks";
            this.location = "Downtown";
            this.hasWiFi = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Location: " + location + ", Has WiFi: " + hasWiFi;
        }

        @Override
        public int hashCode() {
            System.out.println("CafeHashCode: " + super.hashCode());
            return 4040;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setHasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Cafe cafe1 = this;
                Cafe cafe2 = (Cafe) obj;
                if (obj instanceof Cafe) {
                    System.out.println("have ref. will compare..");
                    if (cafe1.name.equals(cafe2.name) && cafe1.location.equals(cafe2.location) && cafe1.hasWiFi == cafe2.hasWiFi) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

