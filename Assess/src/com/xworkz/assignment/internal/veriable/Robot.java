package com.xworkz.assignment.internal.veriable;

    public class Robot {
        private String model;
        private String purpose;
        private boolean isAIEnabled;

        public Robot() {
            System.out.println("Running no-arg constructor of Robot");
            this.model = "RX-500";
            this.purpose = "Industrial";
            this.isAIEnabled = true;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", Purpose: " + purpose + ", Is AI Enabled: " + isAIEnabled;
        }

        @Override
        public int hashCode() {
            System.out.println("RobotHashCode" + super.hashCode());
            return 210;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("ref is not null");
                if (obj instanceof Robot) {
                    System.out.println("have ref. will compare..");
                    Robot robot1 = this;
                    Robot robot2 = (Robot) obj;
                    if (robot1.model.equals(robot2.model)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

