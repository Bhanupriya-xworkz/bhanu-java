package com.xworkz.assignment.internal.veriable2;

    public class Power {
        private String source;
        private int voltage;
        private boolean isRenewable;

        public Power(String source, int voltage, boolean isRenewable) {
            this.source = source;
            this.voltage = voltage;
            this.isRenewable = isRenewable;
        }

        @Override
        public String toString() {
            return "Power{source='" + source + "', voltage=" + voltage + ", isRenewable=" + isRenewable + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("PowerHashCode: " + super.hashCode());
            return 7070;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setVoltage(int voltage) {
            this.voltage = voltage;
        }

        public void setIsRenewable(boolean isRenewable) {
            this.isRenewable = isRenewable;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Power) {
                    System.out.println("Comparing Power objects...");
                    Power p1 = this;
                    Power p2 = (Power) obj;
                    if (p1.source.equals(p2.source) && p1.voltage == p2.voltage && p1.isRenewable == p2.isRenewable) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

