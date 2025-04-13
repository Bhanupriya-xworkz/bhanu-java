package com.xworkz.assignment.internal.veriable3;

    public class Tab {
        private String brand;
        private double screenSize;
        private boolean isWifiEnabled;

        public Tab() {
            System.out.println("Running non-arg constructor Tab");
            System.out.println("brand: " + this.brand);
            this.brand = "Samsung";
            this.screenSize = 10.1;
            this.isWifiEnabled = true;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Screen Size: " + screenSize + ", WiFi Enabled: " + isWifiEnabled;
        }

        @Override
        public int hashCode() {
            System.out.println("TabHashCode: " + super.hashCode());
            return 2048;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public void setWifiEnabled(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Tab) {
                    System.out.println("Have reference. Will compare...");
                    Tab tab1 = this;
                    Tab tab2 = (Tab) obj;
                    if (tab1.brand.equals(tab2.brand)
                            && tab1.screenSize == tab2.screenSize
                            && tab1.isWifiEnabled == tab2.isWifiEnabled) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

