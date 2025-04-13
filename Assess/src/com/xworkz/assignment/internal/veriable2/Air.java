package com.xworkz.assignment.internal.veriable2;

    public class Air {
        private String source;
        private double pressure;
        private String quality;

        public Air(String source, double pressure, String quality) {
            this.source = source;
            this.pressure = pressure;
            this.quality = quality;
        }

        @Override
        public String toString() {
            return "Air{source=" + source + ", pressure=" + pressure + ", quality=" + quality + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("AirHashCode:" + super.hashCode());
            return 8742;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Air) {
                    System.out.println("have ref. will compare..");
                    Air air1 = this;
                    Air air2 = (Air) obj;
                    if (air1.source.equals(air2.source) && air1.quality.equals(air2.quality)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

