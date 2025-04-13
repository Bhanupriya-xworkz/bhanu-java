package com.xworkz.assignment.internal.veriable;

    public class Wifi {
        private String networkName;
        private String encryptionType;
        private boolean isConnected;

        public Wifi() {
            System.out.println("Running no-arg constructor of Wifi");
            this.networkName = "HomeNetwork";
            this.encryptionType = "WPA2";
            this.isConnected = false;
        }

        @Override
        public String toString() {
            return "Network Name: " + networkName + ", Encryption Type: " + encryptionType + ", Is Connected: " + isConnected;
        }

        @Override
        public int hashCode() {
            System.out.println("WifiHashCode" + super.hashCode());
            return 140;
        }

        public void setNetworkName(String networkName) {
            this.networkName = networkName;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Wifi) {
                    System.out.println("have ref. will compare..");
                    Wifi wifi1 = this;
                    Wifi wifi2 = (Wifi) obj;
                    if (wifi1.networkName.equals(wifi2.networkName)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

