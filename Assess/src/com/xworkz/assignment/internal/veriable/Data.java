package com.xworkz.assignment.internal.veriable;

    public class Data {
        private String type;
        private double size; // in GB
        private boolean isEncrypted;

        public Data() {
            System.out.println("Running no-arg constructor of Data");
            this.type = "Mobile Data";
            this.size = 5.0; // Default size in GB
            this.isEncrypted = true;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Size: " + size + "GB, Is Encrypted: " + isEncrypted;
        }

        @Override
        public int hashCode() {
            System.out.println("DataHashCode" + super.hashCode());
            return 150;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Data) {
                    System.out.println("have ref. will compare..");
                    Data data1 = this;
                    Data data2 = (Data) obj;
                    if (data1.type.equals(data2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

