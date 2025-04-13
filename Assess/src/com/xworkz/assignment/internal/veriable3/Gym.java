package com.xworkz.assignment.internal.veriable3;

    public class Gym {
        private String name;
        private int membershipFee;
        private boolean isOpen24Hours;

        public Gym() {
            System.out.println("Running non-arg constructor Gym");
            System.out.println("name: " + this.name);
            this.name = "FitZone";
            this.membershipFee = 1500;
            this.isOpen24Hours = true;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Membership Fee: " + membershipFee + ", Open 24 Hours: " + isOpen24Hours;
        }

        @Override
        public int hashCode() {
            System.out.println("GymHashCode: " + super.hashCode());
            return 3131;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMembershipFee(int membershipFee) {
            this.membershipFee = membershipFee;
        }

        public void setOpen24Hours(boolean isOpen24Hours) {
            this.isOpen24Hours = isOpen24Hours;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Gym) {
                    System.out.println("Have reference. Will compare...");
                    Gym g1 = this;
                    Gym g2 = (Gym) obj;
                    if (g1.name.equals(g2.name) &&
                            g1.membershipFee == g2.membershipFee &&
                            g1.isOpen24Hours == g2.isOpen24Hours) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

