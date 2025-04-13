package com.xworkz.assignment.internal.veriable2;

    public class Data {
        private String type;
        private int size;
        private boolean isEncrypted;

        public Data(String type, int size, boolean isEncrypted) {
            this.type = type;
            this.size = size;
            this.isEncrypted = isEncrypted;
        }

        @Override
        public String toString() {
            return "Data{type=" + type + ", size=" + size + " KB, isEncrypted=" + isEncrypted + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("DataHashCode:" + super.hashCode());
            return 8754;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setEncrypted(boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Data) {
                    System.out.println("have ref. will compare..");
                    Data data1 = this;
                    Data data2 = (Data) obj;
                    if (data1.type.equals(data2.type) && data1.size == data2.size && data1.isEncrypted == data2.isEncrypted) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

