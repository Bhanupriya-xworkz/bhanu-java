package com.xworkz.assignment.internal.veriable2;

    public class Robot {
        private String model;
        private String function;
        private boolean isAutonomous;

        // Constructor
        public Robot(String model, String function, boolean isAutonomous) {
            this.model = model;
            this.function = function;
            this.isAutonomous = isAutonomous;
        }

        @Override
        public String toString() {
            return "Robot{model='" + model + "', function='" + function + "', isAutonomous=" + isAutonomous + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("RobotHashCode: " + super.hashCode());
            return 9090; // Arbitrary hash code
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public void setIsAutonomous(boolean isAutonomous) {
            this.isAutonomous = isAutonomous;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Robot) {
                    System.out.println("Comparing Robot objects...");
                    Robot r1 = this;
                    Robot r2 = (Robot) obj;
                    if (r1.model.equals(r2.model) && r1.function.equals(r2.function) && r1.isAutonomous == r2.isAutonomous) {
                        System.out.println("Both are the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

