package com.xworkz.assignment.internal.veriable;

    public class Wings {
        private String type;
        private String material;
        private boolean isFeathered;

        public Wings() {
            System.out.println("Running no-arg constructor of Wings");
            this.type = "Bird Wings";
            this.material = "Feathers";
            this.isFeathered = true;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Material: " + material + ", Is Feathered: " + isFeathered;
        }

        @Override
        public int hashCode() {
            System.out.println("WingsHashCode" + super.hashCode());
            return 160;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Wings) {
                    System.out.println("have ref. will compare..");
                    Wings wings1 = this;
                    Wings wings2 = (Wings) obj;
                    if (wings1.type.equals(wings2.type)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

