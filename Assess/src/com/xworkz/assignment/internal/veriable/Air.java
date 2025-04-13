package com.xworkz.assignment.internal.veriable;

    public class Air {
        private String composition;
        private double temperature;
        private boolean isPolluted;

        public Air() {
            System.out.println("Running no-arg constructor of Air");
            this.composition = "78% Nitrogen, 21% Oxygen, 1% Other gases";
            this.isPolluted = false;
        }

        @Override
        public String toString() {
            return "Composition: " + composition + ", Temperature: " + temperature + "°C, Is Polluted: " + isPolluted;
        }

        @Override
        public int hashCode() {
            System.out.println("AirHashCode" + super.hashCode());
            return 280;
        }

        public void setComposition(String composition) {
            this.composition = composition;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Air) {
                    System.out.println("have ref. will compare..");
                    Air air1 = this;
                    Air air2 = (Air) obj;
                    if (air1.composition.equals(air2.composition)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

