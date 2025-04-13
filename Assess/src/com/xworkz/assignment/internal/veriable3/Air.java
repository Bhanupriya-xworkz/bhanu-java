package com.xworkz.assignment.internal.veriable3;

    public class Air {
        private int pressure;
        private String quality;
        private boolean fresh;

        public Air() {
            System.out.println("running non-arg constructor Air");
            System.out.println("pressure: " + this.pressure);
            this.pressure = 0;
            this.quality = "Good";
            this.fresh = true;
        }

        @Override
        public String toString() {
            return "Pressure: " + pressure + ", Quality: " + quality + ", Fresh: " + fresh;
        }

        @Override
        public int hashCode() {
            System.out.println("AirHashCode: " + super.hashCode());
            return 987;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                Air air1 = this;
                Air air2 = (Air) obj;
                if (obj instanceof Air) {
                    System.out.println("have ref. will compare..");
                    if (air1.fresh == air2.fresh) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

